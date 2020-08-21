public class Main {
    public static void main(String[] args) {
        String[] kind_of_magic = {"UEBxWw==", "Sk5xVcOICw==", "bnRX", "S0BgWw==", "Nw==", "R0ZxRMOLElk=", "TkJhWw==", "dHZHdcOl", "eWRNYQ==", "bHRSeMOi", "R05tVw==", "d2hScA==", "T0xyVMOADQ==", "f2pQ", "Q0xsVw==", "Nw=="};
        String magic = "7E3Q5fm4lBSKXaHTnlCO52VL/iY6f+hQQ35oeFphtZIu3pf0QuOEpFB5nTeg8GTx";
        byte[] bArr = new byte[kind_of_magic.length];
        for (int i = 0; i < kind_of_magic.length; i++) {
            Base64.Decoder decoder = Base64.getDecoder();
            bArr[i] = (byte) ((Character)c.d(new String(decoder.decode(kind_of_magic[i].getBytes())), i ^ 137).charAt(0)).charValue();
        }

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(magic);

        Cipher invoke = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec newInstance = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        IvParameterSpec newInstance2 = new javax.crypto.spec.IvParameterSpec(bArr);
        invoke.init(Cipher.DECRYPT_MODE, newInstance, newInstance2);
        System.out.println(new String(invoke.doFinal(decoded)));
    }
}