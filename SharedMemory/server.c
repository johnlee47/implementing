#include <sys/ipc.h>
#include <sys/shm.h>
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>

int main(){
	int shm_id;
	size_t size = sizeof(double);
	int shmflg = IPC_CREAT | 0666;

	key_t key = 12345;

	double *double_value;

	shm_id = shmget(key, size, shmflg);

	if(shm_id==-1){
		perror("Error: Shmget failed\n");
	}

	double_value = shmat(shm_id, NULL, 0);

	if(double_value == (double*)-1){
		perror("Error: shmat has failed\n");
		exit(0);
	}

	*double_value = 34.0;
	while(*double_value==34.0)
		sleep(1);

	printf("The other process changed the value to %.2f",*double_value);

	if(shmdt(double_value)==-1){
		perror("Error: shmdt failed");
		//exit(0);
	}

	//shmctl(shm_id,IPC_RMID,NULL);
	return 0;

}
