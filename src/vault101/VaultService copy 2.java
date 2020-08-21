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
                    java.lang.System.exit(0);
                    return false;
                } else if (str == null) {
                    return false;
                } else {
                    byte[] b2 = b.c.a.a.b(str.getBytes());
                    bytep[] invoke = android.util.Base64.encode(b2, android.util.Base64.NO_WRAP);
                    Strinb newInstance = new String(invoke);
                    String invoke2 = context.getString(R.string.magic);
                    return invoke2.equals(newInstance);
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
            String[] invoke = this.getResources().getStringArray(R.array.kind_of_magic);
            if (invoke != null) {
                int length = invoke.length;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Character)c.d(new String(android.util.Base64.decode(invoke[i], android.util.Base64.NOWRAP)), i ^ 137).charAt(0)).charValue();
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
