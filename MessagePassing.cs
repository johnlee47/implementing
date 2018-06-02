using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MessagePassing
{
    class MsgPassing
    {
        static void Main(string[] args)
        {
            MsgPass_Const obj1 = new MsgPass_Const(5, 10);
            MsgPass_Const obj2 = new MsgPass_Const((float)14.73, (float)10.59);

        }
    }

    public class MsgPass_Const
    {
        public MsgPass_Const(int x, int y)
        {
            int z = x + y;
            Console.WriteLine("The sum of the integers is: " + z);
        }

        public MsgPass_Const(float x, float y)
        {
            float z = x * y;
            Console.WriteLine("The Float value is: " + z);
            Console.ReadKey();
        }

    }
}
