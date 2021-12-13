package GGs;
public final class MyString2 {
    char[] chars;
    String s;

    public MyString2(String s) {
        this.chars = s.toCharArray();
        this.s = s;
    }

    public int compare(String s) {
        int currObjTotal = 0;
        int sTotal = 0;

        if (this.chars.length != s.length()) {
            int commonLength = 0;
            for (int i = 0; i < chars.length && i < s.length(); i++) {
                commonLength = i;
            }
            return (Character.toLowerCase(this.chars[commonLength]) - Character.toLowerCase(s.charAt(commonLength)) < 0) ? -1 : 1;
        }

        for (int i = 0; i < s.length(); i++) {
            currObjTotal += Character.toLowerCase(chars[i]);
            sTotal += Character.toLowerCase(s.charAt(i));
        }
        return currObjTotal - sTotal;
    }

    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < chars.length; i++) {
            s += chars[i];
        }
        return new MyString2(s);

    }

    public MyString2 toUpperCase() {
        char[] chs = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chs[i] = Character.toUpperCase(chars[i]);
        }
        String b = "";
        for(int i =0;i < chars.length;i++)
            b += chs[i];

        return new MyString2(b);

    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }

}


class mymain{
    public static void main(String[] args) {
        var myst = new MyString2("deterministic");
        MyString2 b = myst.substring(5);
        MyString2 c = myst.toUpperCase();
        System.out.println("sub: " + b.s + "\n"+
                "up: " + c.s + "\nDeterministic VS Undeterministic: " + myst.compare("retErmiNistic"));
    }
}