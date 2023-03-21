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


    public String checkNoiSinh(String cccd) {
        char[] c = cccd.toCharArray();
        if (c[1] == '0') {
            switch (c[2]) {
                case '1':
                    return "Hà Nội";
                case '2':
                    return "Hà Giang";
                case '4':
                    return "Cao Bằng";
                case '6':
                    return "Bắc Kạn";
                case '8':
                    return "Tuyên Quang";
                default:
                    break;
            }

        }
        if (c[1] == '1') {
            switch (c[2]) {
                case '0':
                    return "Lào Cai";
                case '1':
                    return "Điện Biên";
                case '2':
                    return "Lai Châu";
                case '4':
                    return "Sơn La";
                case '5':
                    return "Yên Bái";
                case '7':
                    return "Hào Bình";
                case '9':
                    return "Thái Nguyên";
                default:
                    break;
            }
        }
        if (c[1] == '2') {
            switch (c[2]) {
                case '0':
                    return "Lạng Sơn";
                case '2':
                    return "Quảng Ninh";
                case '4':
                    return "Bắc Giang";
                case '5':
                    return "Phú Thọ";
                case '6':
                    return "Vĩnh Phúc";
                case '7':
                    return "Bắc Ninh";
                default:
                    break;
            }

        }
        if (c[1] == '3') {
            switch (c[2]) {
                case '0':
                    return "Hải Dương";
                case '1':
                    return "Hải Phòng";
                case '3':
                    return "Hưng Yên";
                case '4':
                    return "Thái Bình";
                case '5':
                    return "Hà Nam";
                case '6':
                    return "Nam Định";
                case '7':
                    return "Ninh Bình";
                case '8':
                    return "Thanh Hóa";
                default:
                    break;
            }
        }
        if (c[1] == '4') {
            switch (c[2]) {
                case '0':
                    return "Nghệ An";
                case '2':
                    return "Hà Tĩnh";
                case '4':
                    return "Quảng Bình";
                case '5':
                    return "Quảng Trị";
                case '6':
                    return "Thừa Thiên Huế";
                case '8':
                    return "Đà Nẵng";
                case '9':
                    return "Quảng Nam";
                default:
                    break;
            }
        }
        if (c[1] == '5') {
            switch (c[2]) {
                case '1':
                    return "Quảng Ngãi";
                case '2':
                    return "Bình Định";
                case '4':
                    return "Phú Yên";
                case '6':
                    return "Khánh Hòa";
                case '8':
                    return "Ninh Thuận";
                default:
                    break;
            }
        }
        if (c[1] == '6') {
            switch (c[2]) {
                case '0':
                    return "Bình Thuận";
                case '2':
                    return "Kon Tum";
                case '4':
                    return "Gia Lai";
                case '6':
                    return "Đắk Lắk";
                case '7':
                    return "Đắk Nông";
                case '8':
                    return "Lâm Đồng";
                default:
                    break;
            }
        }
        if (c[1] == '7') {
            switch (c[2]) {
                case '0':
                    return "Bình Phước";
                case '2':
                    return "Tây Ninh";
                case '4':
                    return "Bình Dương";
                case '5':
                    return "Đồng Nai";
                case '7':
                    return "Bà Rịa - Vũng Tàu";
                case '9':
                    return "Hồ Chí Minh";
                default:
                    break;
            }
        }
        if (c[1] == '8') {
            switch (c[2]) {
                case '0':
                    return "Long An";
                case '2':
                    return "Tiền Giang";
                case '3':
                    return "Bến Tre";
                case '4':
                    return "Trà Ving";
                case '6':
                    return "Vĩnh Long";
                case '7':
                    return "Đồng Tháp";
                case '9':
                    return "An Giang";
                default:
                    break;
            }
        }
        if (c[1] == '9') {
            switch (c[2]) {
                case '1':
                    return "Kiên Giang";
                case '2':
                    return "Cần Thơ";
                case '3':
                    return "Hậu Giang";
                case '4':
                    return "Sóc Trăng";
                case '5':
                    return "Bạc Liêu";
                case '7':
                    return "Cà Mau";
                default:
                    break;
            }
        }
        return "false";
    }

    public String checkGTvaNamSinh(String cccd) {
        char[] c = cccd.toCharArray();
        String s = "";

        switch (c[3]) {
            case '0':
                s += "Nam | 19";
                break;
            case '1':
                s += "Nu | 19";
                break;
            case '2':
                s += "Nam | 20";
                break;
            case '3':
                s += "Nu | 20";
                break;
            case '4':
                s += "Nam | 21";
                break;
            case '5':
                s += "Nu | 21";
                break;
            case '6':
                s += "Nam | 22";
                break;
            case '7':
                s += "Nu | 22";
                break;
            case '8':
                s += "Nam | 23";
                break;
            case '9':
                s += "Nu | 23";
                break;
            default:
                break;
        }
        s += c[4];
        s += c[5];
        return s;
    }

    public String checkSoNgauNhien(String cccd) {
        char[] c = cccd.toCharArray();
        String s = "";
        s += c[6];
        s += c[7];
        s += c[8];
        s += c[9];
        s += c[10];
        s += c[11];
        return s;
    }
}
