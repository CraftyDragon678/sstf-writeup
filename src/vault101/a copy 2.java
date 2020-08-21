package b.c.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static byte[] f821a;

    public static byte[] a(byte[] bArr) {
        try {
            Cipher invoke = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec newInstance = new javax.crypto.spec.SecretKeySpec(f821a, "AES");
            IvParameterSpec newInstance2 = new javax.crypto.spec.IvParameterSpec(f821a);
            invoke.init(Cipher.DECRYPT_MODE, newInstance, newInstance2);
            return invoke.doFinal(bArr);
        } catch (Throwable unused) {
            throw new RuntimeException();
        }
    }

    public static byte[] b(byte[] bArr) {
        Class<a> cls = a.class;
        try {
            Cipher invoke = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec newInstance = new javax.crypto.spec.SecretKeySpec(f821a, "AES");
            IvParameterSpec newInstance2 = new javax.crypto.spec.IvParameterSpec(f821a);
            invoke.init(Cipher.ENCRYPT_MODE, newInstance, newInstance2);
            return invoke.doFinal(bArr);
        } catch (Throwable unused) {
            throw new RuntimeException();
        }
    }
}
