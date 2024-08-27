package assignment;

class UserMainCode3 {
    public static int validateColorCode(String colorCode) {
        if (colorCode.charAt(0) != '#') {
            return -1;
        }
        if (colorCode.length() != 7) {
            return -1;
        }
        for (int i = 1; i < colorCode.length(); i++) {
            char ch = colorCode.charAt(i);
            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
                return -1;
            } 
            
        }
        return 1;
    }
} 
