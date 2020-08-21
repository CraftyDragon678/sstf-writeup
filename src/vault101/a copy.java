package b.c.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static byte[] f821a;

    public static byte[] a(byte[] bArr) {
        Class<a> cls = a.class;
        try {
            Object invoke = Class.forName("javax.crypto.Cipher").getMethod("getInstance", new Class[]{Class.forName("java.lang.String")}).invoke((Object) null, new Object[]{"AES/CBC/PKCS5Padding"});
            Object newInstance = Class.forName("javax.crypto.spec.SecretKeySpec").getConstructor(new Class[]{Class.forName("[B"), Class.forName("java.lang.String")}).newInstance(new Object[]{cls.getDeclaredFields()[0].get((Object) null), "AES"});
            Object newInstance2 = Class.forName("javax.crypto.spec.IvParameterSpec").getConstructor(new Class[]{Class.forName("[B")}).newInstance(new Object[]{cls.getDeclaredFields()[0].get((Object) null)});
            Object obj = Class.forName("javax.crypto.Cipher").getDeclaredField("DECRYPT_MODE").get((Object) null);
            Class.forName("javax.crypto.Cipher").getMethod("init", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null), Class.forName("java.security.Key"), Class.forName("java.security.spec.AlgorithmParameterSpec")}).invoke(invoke, new Object[]{obj, newInstance, newInstance2});
            return (byte[]) Class.forName("javax.crypto.Cipher").getMethod("doFinal", new Class[]{Class.forName("[B")}).invoke(invoke, new Object[]{bArr});
        } catch (Throwable unused) {
            throw new RuntimeException();
        }
    }

    public static byte[] b(byte[] bArr) {
        Class<a> cls = a.class;
        try {
            Object invoke = Class.forName("javax.crypto.Cipher").getMethod("getInstance", new Class[]{Class.forName("java.lang.String")}).invoke((Object) null, new Object[]{"AES/CBC/PKCS5Padding"});
            Object newInstance = Class.forName("javax.crypto.spec.SecretKeySpec").getConstructor(new Class[]{Class.forName("[B"), Class.forName("java.lang.String")}).newInstance(new Object[]{cls.getDeclaredFields()[0].get((Object) null), "AES"});
            Object newInstance2 = Class.forName("javax.crypto.spec.IvParameterSpec").getConstructor(new Class[]{Class.forName("[B")}).newInstance(new Object[]{cls.getDeclaredFields()[0].get((Object) null)});
            Object obj = Class.forName("javax.crypto.Cipher").getDeclaredField("ENCRYPT_MODE").get((Object) null);
            Class.forName("javax.crypto.Cipher").getMethod("init", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null), Class.forName("java.security.Key"), Class.forName("java.security.spec.AlgorithmParameterSpec")}).invoke(invoke, new Object[]{obj, newInstance, newInstance2});
            return (byte[]) Class.forName("javax.crypto.Cipher").getMethod("doFinal", new Class[]{Class.forName("[B")}).invoke(invoke, new Object[]{bArr});
        } catch (Throwable unused) {
            throw new RuntimeException();
        }
    }
}
