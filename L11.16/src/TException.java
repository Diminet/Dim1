public class TException {

        public static void main(String[] args) {
            try {
                throw new ExceptionB("Exception B");
            } catch (ExceptionA a) {
                a.printStackTrace();
            }

            try {
                throw new ExceptionC("Exception C");
            } catch (ExceptionA a) {
                a.printStackTrace();
            }
        }
    }

