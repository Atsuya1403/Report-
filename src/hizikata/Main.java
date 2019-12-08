package hizikata;

class main {
    public static void main(String[] args){
        String str;
        str = null;
        try {
            System.out.println(str.length());
            throw new NullPointerException("例外が発生しました");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

