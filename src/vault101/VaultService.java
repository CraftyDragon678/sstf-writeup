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
                    Class.forName(c.d(";È\u0003p¯4Å¶orÂ\"Ý\u0010|", -500953648)).getMethod(c.d("qó%", 991422357), new Class[]{(Class) Class.forName(c.d("~jxe\u0005reíY:Bè`niaY", 1069257791)).getDeclaredField(c.d("\u0001ò¬\u0010", 1659367412)).get((Object) null)}).invoke((Object) null, new Object[]{0});
                    return false;
                } else if (str == null) {
                    return false;
                } else {
                    Object b2 = b.c.a.a.b((byte[]) Class.forName(c.d(".Â®$\u000fß1Ç\u0003?Ú6Ê¶\"", 1451800421)).getMethod(c.d("7Ì£\u0002rØ0X", -552283301), new Class[0]).invoke(str, new Object[0]));
                    Object invoke = Class.forName(c.d("aogrfle¯}qjì.Cbsl35", 823239689)).getMethod(c.d("$OX{Í\u0010", -2050089752), new Class[]{Class.forName(c.d("\u000eé", 937562454)), (Class) Class.forName(c.d(";HCp¯\u0005tå¶ohõ%LRtó", -730536752)).getDeclaredField(c.d("\u0014ø¡\u0014", -1215097919)).get((Object) null)}).invoke((Object) null, new Object[]{b2, Class.forName(c.d("pç\u000bfÆ´!\rÌ!BZ?Ë\u000egÌëq", -1393972808)).getDeclaredField(c.d("\u001aä\u0017Yï\u0004", 1778992991)).get((Object) null)});
                    Object newInstance = Class.forName(c.d("~jxe\u0005remY:Xrfb`c", 1356052543)).getConstructor(new Class[]{Class.forName(c.d("[C", 591904395))}).newInstance(new Object[]{invoke});
                    Object invoke2 = Class.forName(c.d("$Í\u001efÆ4\u0007:EH Í\u000e:ê>]-_", -248372756)).getMethod(c.d("&DÇ\u0003ÿ\u0016xg¬", 64103114), new Class[]{(Class) Class.forName(c.d("/BNt\u001fqç`ó1F_pÓ", -401453852)).getDeclaredField(c.d("\u0001ò\u0004D", 195131734)).get((Object) null)}).invoke(VaultService.this, new Object[]{Integer.valueOf(R.string.magic)});
                    return ((Boolean) Class.forName(c.d("zhs`-ddmu.Rwb`kf", -754317293)).getMethod(c.d("tø\u001auÅ®", 528601528), new Class[]{Class.forName(c.d("oâ5º!OÈzä\u0016oæ ", -1620091986))}).invoke(invoke2, new Object[]{newInstance})).booleanValue();
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
            Object invoke = Class.forName(c.d("!Ï#î5£.Ï%Ïó\"$Ò5Ó4ò", 354045889)).getMethod(c.d("#Fä\u0012uQyç#@ó»%Z", 1074255429), new Class[]{(Class) Class.forName(c.d("ê1§£%Íúkêaî5û", -72994916)).getDeclaredField(c.d("\u0010zBE", 1821340751)).get((Object) null)}).invoke(Class.forName(c.d("0Gqsn@q¥2noÿ4Ga/BF{ÿ4yu", 1132272720)).getMethod(c.d("bf~VNeoô]wn÷", 1545475118), new Class[0]).invoke(this, new Object[0]), new Object[]{Integer.valueOf(R.array.kind_of_magic)});
            if (invoke != null) {
                int length = Array.getLength(invoke);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = (byte) ((Character) Class.forName(c.d("k`Õ1¥(`oìjð$shÍ7", 25375370)).getMethod(c.d("wã\u000ffè«", -375635523), new Class[]{(Class) Class.forName(c.d("oâ6`/ï!Ob/HOqæ'ds", 1759650052)).getDeclaredField(c.d("\u0000rÌ\u0000", 575374967)).get((Object) null)}).invoke(c.d((CharSequence) Class.forName(c.d(";HÁ1§\u0001te¾kð.#@Ù7", -158782760)).getConstructor(new Class[]{Class.forName(c.d("JË", 543344920))}).newInstance(new Object[]{Class.forName(c.d("uå&Ä· \rË Â\u001a:É'Îèp", 446383039)).getMethod(c.d(" Fñ/mB", 825348685), new Class[]{Class.forName(c.d("+À§ -Ì0Ç$.Ò3È¿&", 1167863618)), (Class) Class.forName(c.d("?Ê¨%\u0007Ó5E\u001a;Â\u0000!Î¹![", -521211012)).getDeclaredField(c.d("\u0010zè\u0010", -1491966233)).get((Object) null)}).invoke((Object) null, new Object[]{Array.get(invoke, i), Class.forName(c.d("$M^fÆ\u001et§!Bðka[gÌA$", -1048288020)).getDeclaredField(c.d("\nlÇ\u0012qs@", 282303079)).get((Object) null)})}), i ^ 137), new Object[]{0})).charValue();
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
