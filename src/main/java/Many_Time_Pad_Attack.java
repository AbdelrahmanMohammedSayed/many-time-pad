
public class Many_Time_Pad_Attack {

    public static void main(String[] args) {
        String[] M_HEXA = {"D69CAD49A730779711B101721B226B72D187A817C57BC2C2882C828FBE0D79BDC392665762C9E577DFB997A21A6EAFDEE7FFD14F90EC85141D3CD06FC286513C9D65318B879C0A987CA2944B5A2BB30872E8D61D53D8F5561778B7FCC7162818AFE4C07D07451D8DE4E0DA50EDB82FC8877DD61E8FB8A217F72B554051949B5EE33E9F6A738238BE6529D483651B06DB",
            "CA9BB35FF1216AD804FE03330B636620D58AAF1D812ED3C2CB399F95A80D7ABD9B91274E7EC9EF77D4B78CE61B66EACEA2EAC00E98EA99531E2CD13C959756648D202B8CC08611D37C979D4D5F6CB60227F5DA524B9EB4175379A1E6C91F664CA6ABD37D05090487F9E0",
            "E996FA5BB03B71971CB1543A19356072C384B61DC57AD4DFDC789E8EAC592DBCD483354E2DD8AB3AC3B78CA21565B3CEAFFBDA49DEEC85530138D1688B9141288837788FD29B16DD28AFD5415F28A80466F2D71D48D6B443173EBAEADC146651BAABC535031708C2E3FCDA02B9A97ACFCF63CD06C3F7B252A2",
            "BEA0B50CA63D7C971BB61B2714276B75C4CBAC1DC564C4D4DC788989BD5420A8DA9532452ACDAB24CFB885EE112BB9DFA9E6D1409DE0CB121F3D837B87861425C927348AC48342923AE0814D4938E15827CED34B599EB4175B73BDE48E103218BDE3D77D000A018EF8E3D64CAA",
            "BE87B24DA57562D21CAD543E1D257172C484FB0F8D67D2CFCD2E8F94ED4463ACDE9428007DCDF877D3B884ED067FBFD4A6E6D10E9BEB8406163183688DD24325852E7883CE9A11897CA99B5C5E6CB50F62A6DD5B5AD7B6521768BAEEDA512259B0A5921408161D8BE5F1DB02AFB522CF877DD74ADCBEA442E1375D5B5A",
            "DF80A959BC3025C300BF007211636D33C68EFB1C8068D8C9CD3CCA88A85A2D8ADA88224F6784BF658FF68BEC5468A6DBB4E1944F90E1CB1A1F79C2728D865C219B653B89C69B11DD35E0944F5025AF4763E9925359C9F5655672B6E0C3596F18A6E5DE2446040386B7FD9F45A2B822DF8672C20FDDB2BE43A0315147418E8A02ED759A6A36D629B4626C848E6E0355CAC3253BD3732BDA26A3B7B4A13C37975695033B48DE690FD2BA5D56B4F32EF2FEC32D32A0F5F373BE4461873E610B02145B1F11E4CCDF26662D1C81A8CE523874A1F6048B0876D363205333F446E032A37386172957CA77DC2421B450EF6DBF25CC1EFACFB9099B7E6D206BF9A8B05B5D49CB3ED613D140B1879BD7C4F04ABEF275D85E153AC53AF09C04EE81F3A3A4D178E3152D1C8A611D9ABB300474C5D70CD3CC89129269238C9F691AC1617F4CA203F9",
            "D787FA41B8326DC348AD11371563703CC28EB719916BD587DB318485A80D64AC9B8B23526FC0F277D5B387EF072BBED5E7F0D10E9FA599161738C0688D8014269C31788CD3C80B8E7CA4904E5822A81362EACB1D4EDBB9564379B6A18E3E1618BEEAC17D1400408BF9E7CB43A3B86BDA9B7DCA0D8FA3B852A011555A508D930CA43E9D7C64C335BE6229C19965080C9ED22F3ED83A2EC726A3AEB9B420789A5681032648CE6D179EAD58",
            "CA9BBF55F13477D248B9113C1D316426D58FFB0D9667DFC08839CA82A85968AAD68F284979D8E23486B78EE51B79A3CEAFFF",
            "CE81B54EBD30689701AD542610227172C984AE58966BD4C3882C8283ED5F6CB6DF892B006DC9E532D4B796ED062BABDDA6FBDA00DEC09D16032083688B9F5164902A2DC5D48D07997CA981084524A4476EE8DB4955DFB9",
            "ED87BB58B4756AD148AA1C375831643CD484B6588B7BDCC5CD2ACA81A84368AADA9229522ACBEE23D5F690E7076EBE9AA6FCD00E8AED8E531730D16F96D2462587213788878617903EA587084823B44760E3DC584EDFA152176BBBE3C251245DE9FFDA3846030490E4E09F50ACA266D48234CA1FC2B5B545A02252405190DE58AB3ED37078CB35B87165849C741B01DB"};

        String Target = "CA9BBF0CA23066C50DAA543F1D307633D78EFB11963491F0C03D84C6B85E64B6DCC6270079D8F932C7BBC2E11D7BA2DFB5B2DA4B88E09953042AC63C969A5164822021C5CA8710987CB49D495F6CAE0964E392150D87E7000529EBA6";
        String[] M_BINARY = new String[10];
        StringBuilder[] M_Xor_T = new StringBuilder[10];
        String TARGET_BINARY = HEXATOBINARY(Target);
        for (int i = 0; i < M_BINARY.length; i++) {
            M_BINARY[i] = HEXATOBINARY(M_HEXA[i]);
        }
        System.out.println("****************************************************************************************************");
        System.out.println("****************************************************************************************************");

        // The secret message is: When using a stream cipher never use the key more than once (1927259) 
        // tuvwprshikate opqsf the cbegfrcafgeyxgdsqutofgzy9:)(wmut nufmeutwrcba gqrstwetvntupqrsnodeahivttoxrget
        // System.out.println(TARGET_BINARY);
        for (int i = 0; i < 10; i++) {
            M_Xor_T[i] = XOR(TARGET_BINARY, M_BINARY[i]);
        }
        int i = 0;
        String[] arr = new String[10];
        String s = "abcdefghijklmnopqrstuvwxyz(:0123456789)", test = "";
        String gf = STRINGTOBINARY(s);
        int len = Integer.min(TARGET_BINARY.length(), M_BINARY[i].length());
        for (int k = 0; k < gf.length(); k = k + 8) {
            for (int j = 0; j < gf.length(); j = j + 8) {
                String TEXT = "";
                char c = '0';
                for (i = 0; i < M_Xor_T.length; i++) {
                    StringBuilder u = XOR(gf.substring(j, j + 8), M_Xor_T[i].substring(k, k + 8));
                    StringBuilder binary = new StringBuilder(u);
                    c = BINARYTOCHAR(binary);
                    TEXT += c;
                }
                if (ACCEPTED(TEXT)) {
                    System.out.print(c);
                    test += c;
                }
//                else {
//                    System.out.print("_");
//                    test += "_";
//                }
            }
        }
        System.out.println( "\nlength : " + test.length());
        System.out.println("****************************************************************************************************");
        System.out.println("****************************************************************************************************");

    }

    public static String HEXATOBINARY(String hex) {
        StringBuilder result = new StringBuilder(hex.length() * 4);
        for (char c : hex.toUpperCase().toCharArray()) {
            switch (c) {
                case '0':
                    result.append("0000");
                    break;
                case '1':
                    result.append("0001");
                    break;
                case '2':
                    result.append("0010");
                    break;
                case '3':
                    result.append("0011");
                    break;
                case '4':
                    result.append("0100");
                    break;
                case '5':
                    result.append("0101");
                    break;
                case '6':
                    result.append("0110");
                    break;
                case '7':
                    result.append("0111");
                    break;
                case '8':
                    result.append("1000");
                    break;
                case '9':
                    result.append("1001");
                    break;
                case 'A':
                    result.append("1010");
                    break;
                case 'B':
                    result.append("1011");
                    break;
                case 'C':
                    result.append("1100");
                    break;
                case 'D':
                    result.append("1101");
                    break;
                case 'E':
                    result.append("1110");
                    break;
                case 'F':
                    result.append("1111");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid hex: '" + hex + "'");
            }
        }
        return result.toString();
    }

    public static StringBuilder XOR(String T, String M) {
        StringBuilder result = new StringBuilder(T.length());
        int len = Integer.min(T.length(), M.length());
        for (int i = 0; i < len; i++) {
            result.append(M.charAt(i) ^ T.charAt(i));
        }
        return result;
    }

    public static String STRINGTOBINARY(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))
                            .replaceAll(" ", "0")
            );
        }
        return result.toString();
    }

    public static char BINARYTOCHAR(StringBuilder binary) {
        int asciiValue = Integer.parseInt(binary.toString(), 2);
        return (char) asciiValue;
    }

    public static boolean ACCEPTED(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == '(') || (c == ')') || (c == ':') || (c == ' ')) {
                continue;
            } else {
                flag = false;
            }
        }
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}

/*
{"D69CAD49A730779711B101721B226B72D187A817C57BC2C2882C828FBE0D79BDC392665762C9E577DFB997A21A6EAFDEE7FFD14F90EC85141D3CD06FC286513C9D65318B879C0A987CA2944B5A2BB30872E8D61D53D8F5561778B7FC",
"CA9BB35FF1216AD804FE03330B636620D58AAF1D812ED3C2CB399F95A80D7ABD9B91274E7EC9EF77D4B78CE61B66EACEA2EAC00E98EA99531E2CD13C959756648D202B8CC08611D37C979D4D5F6CB60227F5DA524B9EB4175379A1E6",
"E996FA5BB03B71971CB1543A19356072C384B61DC57AD4DFDC789E8EAC592DBCD483354E2DD8AB3AC3B78CA21565B3CEAFFBDA49DEEC85530138D1688B9141288837788FD29B16DD28AFD5415F28A80466F2D71D48D6B443173EBAEA",
"BEA0B50CA63D7C971BB61B2714276B75C4CBAC1DC564C4D4DC788989BD5420A8DA9532452ACDAB24CFB885EE112BB9DFA9E6D1409DE0CB121F3D837B87861425C927348AC48342923AE0814D4938E15827CED34B599EB4175B73BDE4",
"BE87B24DA57562D21CAD543E1D257172C484FB0F8D67D2CFCD2E8F94ED4463ACDE9428007DCDF877D3B884ED067FBFD4A6E6D10E9BEB8406163183688DD24325852E7883CE9A11897CA99B5C5E6CB50F62A6DD5B5AD7B6521768BAEE",
"DF80A959BC3025C300BF007211636D33C68EFB1C8068D8C9CD3CCA88A85A2D8ADA88224F6784BF658FF68BEC5468A6DBB4E1944F90E1CB1A1F79C2728D865C219B653B89C69B11DD35E0944F5025AF4763E9925359C9F5655672B6E0",
"D787FA41B8326DC348AD11371563703CC28EB719916BD587DB318485A80D64AC9B8B23526FC0F277D5B387EF072BBED5E7F0D10E9FA599161738C0688D8014269C31788CD3C80B8E7CA4904E5822A81362EACB1D4EDBB9564379B6A1",
"CA9BBF55F13477D248B9113C1D316426D58FFB0D9667DFC08839CA82A85968AAD68F284979D8E23486B78EE51B79A3CEAFFF",
"CE81B54EBD30689701AD542610227172C984AE58966BD4C3882C8283ED5F6CB6DF892B006DC9E532D4B796ED062BABDDA6FBDA00DEC09D16032083688B9F5164902A2DC5D48D07997CA981084524A4476EE8DB4955DFB9",
"ED87BB58B4756AD148AA1C375831643CD484B6588B7BDCC5CD2ACA81A84368AADA9229522ACBEE23D5F690E7076EBE9AA6FCD00E8AED8E531730D16F96D2462587213788878617903EA587084823B44760E3DC584EDFA152176BBBE3",
"CA9BBF0CA23066C50DAA543F1D307633D78EFB11963491F0C03D84C6B85E64B6DCC6270079D8F932C7BBC2E11D7BA2DFB5B2DA4B88E09953042AC63C969A5164822021C5CA8710987CB49D495F6CAE0964E392150D87E7000529EBA6"}
 */
