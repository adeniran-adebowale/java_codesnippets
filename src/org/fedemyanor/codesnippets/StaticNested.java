package src.org.fedemyanor.codesnippets;

public class StaticNested {
    public static void main(String[] args) {
        Object o;
        int num=3;
        InnerStaticNested.Inside tr= new InnerStaticNested.Inside();
        o=tr.powerRaise(num);
        

    }

    

        /**
         * InnerStaticNested
         */
        public class InnerStaticNested {

            static class Inside{
        
            String powerRaise(int value){

                return "THE "+value;
            }
        }

    }
}
