package com.sctf2020.vault101;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b.c.a.b;
import b.c.a.c;
import java.lang.reflect.Array;

public class VaultService extends Service {

    /* renamed from: b  reason: collision with root package name */
    public IBinder f873b = new b((a) null);

    public class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        public int f874a;

        public b(a aVar) {
        }

        public boolean a(String str) {
            try {
                int i = this.f874a + 1;
                this.f874a = i;
                if (i > 3) {
                    Class.forName("java.lang.System").getMethod("exit", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke((Object) null, new Object[]{0});
                    return false;
                } else if (str == null) {
                    return false;
                } else {
                    Object b2 = b.c.a.a.b((byte[]) Class.forName("java.lang.String").getMethod("getBytes", new Class[0]).invoke(str, new Object[0]));
                    Object invoke = Class.forName("android.util.Base64").getMethod("encode", new Class[]{Class.forName("[B"), (Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke((Object) null, new Object[]{b2, Class.forName("android.util.Base64").getDeclaredField("NO_WRAP").get((Object) null)});
                    Object newInstance = Class.forName("java.lang.String").getConstructor(new Class[]{Class.forName("[B")}).newInstance(new Object[]{invoke});
                    Object invoke2 = Class.forName("android.content.Context").getMethod("getString", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke(VaultService.this, new Object[]{Integer.valueOf(R.string.magic)});
                    return ((Boolean) Class.forName("java.lang.String").getMethod("equals", new Class[]{Class.forName("java.lang.Object")}).invoke(invoke2, new Object[]{newInstance})).booleanValue();
                }
            } catch (Throwable unused) {
                throw new RuntimeException();
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f873b;
    }

    public void onCreate() {
        try {
            Object invoke = Class.forName("android.content.res.Resources").getMethod("getStringArray", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke(Class.forName("android.content.Context").getMethod("getResources", new Class[0]).invoke(this, new Object[0]), new Object[]{Integer.valueOf(R.array.kind_of_magic)});
            if (invoke != null) {
                int length = Array.getLength(invoke);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = (byte) ((Character) Class.forName("java.lang.String").getMethod("charAt", new Class[]{(Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke(c.d((CharSequence) Class.forName("java.lang.String").getConstructor(new Class[]{Class.forName("[B")}).newInstance(new Object[]{Class.forName("android.util.Base64").getMethod("decode", new Class[]{Class.forName("java.lang.String"), (Class) Class.forName("java.lang.Integer").getDeclaredField("TYPE").get((Object) null)}).invoke((Object) null, new Object[]{Array.get(invoke, i), Class.forName("android.util.Base64").getDeclaredField("NO_WRAP").get((Object) null)})}), i ^ 137), new Object[]{0})).charValue();
                }
                b.c.a.a.class.getDeclaredFields()[0].set((Object) null, bArr);
                return;
            }
            throw new NullPointerException();
        } catch (Throwable unused) {
            throw new RuntimeException();
        }
    }
}
