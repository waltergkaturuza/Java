public class HumanInnerClasNonStatic  {
    private String name;
    private int pounds;
    public class Brain{
        public String brainName(){
            return name;
        }

    }
    public class Heart{
        public String heartName(){
            return name;
        }
    }
}
