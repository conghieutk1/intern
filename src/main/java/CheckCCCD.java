public class CheckCCCD {
    private String cccd;
    public String getcccd() {
        return cccd;
    }

    public void setcccd(String cccd) {
        this.cccd = cccd;
    }

    public boolean checkCCCD(String cccd) {
        char[] c = cccd.toCharArray();
        if (cccd.length() != 12) return false;
        // Kiem tra ma tinh
        if (c[0] != '0') return false;
        if (c[1] == '0') {
            if (c[2] == '1' || c[2] == '2' || c[2] == '4' || c[2] == '6' || c[2] == '8') return true;
        }
        if (c[1] == '1') {
            if (c[2] == '0' || c[2] == '1' || c[2] == '2' || c[2] == '4' || c[2] == '5' || c[2] == '7' || c[2] == '9') return true;
        }
        if (c[1] == '2') {
            if (c[2] == '0' || c[2] == '2' || c[2] == '4' || c[2] == '5' || c[2] == '6' || c[2] == '7') return true;
        }
        if (c[1] == '3') {
            if (c[2] == '0' || c[2] == '1' || c[2] == '3' || c[2] == '4' || c[2] == '5' || c[2] == '6' || c[2] == '7' || c[2] == '8') return true;
        }
        if (c[1] == '4') {
            if (c[2] == '0' || c[2] == '2' || c[2] == '4' || c[2] == '5' || c[2] == '6' || c[2] == '8' || c[2] == '9') return true;
        }
        if (c[1] == '5') {
            if (c[2] == '1' || c[2] == '2' || c[2] == '4' || c[2] == '6' || c[2] == '8') return true;
        }
        if (c[1] == '6') {
            if (c[2] == '0' || c[2] == '2' || c[2] == '4' || c[2] == '6' || c[2] == '7' || c[2] == '8') return true;
        }
        if (c[1] == '7') {
            if (c[2] == '0' || c[2] == '2' || c[2] == '4' || c[2] == '5' || c[2] == '7' || c[2] == '9') return true;
        }
        if (c[1] == '8') {
            if (c[2] == '0' || c[2] == '2' || c[2] == '3' || c[2] == '4' || c[2] == '6' || c[2] == '7' || c[2] == '9') return true;
        }
        if (c[1] == '9') {
            if (c[2] == '1' || c[2] == '2' || c[2] == '3' || c[2] == '4' || c[2] == '5' || c[2] == '6') return true;
        }

        // Kiem tra gioi tinh
        if (Character.getNumericValue(c[3]) > 0 && Character.getNumericValue(c[3]) < 10) return true;
        // Kiem tra nam sinh
        if ((Character.getNumericValue(c[4]) >= 0 && Character.getNumericValue(c[4]) < 10) && (Character.getNumericValue(c[5]) >= 0 && Character.getNumericValue(c[5]) < 10)) return true;

        for (int i = 6; i < 12; i++) {
            if (c[i] == '0' || c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6' || c[i] == '7' || c[i] == '8' || c[i] == '9') {
                return true;
            }
        }
        return false;
    }
}
