package hizikata;

class main {
    public static void main(String[] args){
        String str;
        str = null;
        try {
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("例外が発生しました");
            System.out.println(e.getMessage());
        }

    }
}

