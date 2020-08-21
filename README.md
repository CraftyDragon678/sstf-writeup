> 안녕하세요 뉴비입니다.

# REV

## Vault 101

### Analyze

우선 apk파일을 다운 받아주고 열어준다.

![app](img/vault101/App.png)
열면 대충 이렇게 생겼다.

플래그를 알아내면 되는 듯 하다.

jadx로 까보면 아래와 같다.

![decompile](img/vault101/Decompile.png)
그렇다... 난독화가 되어있다.

[메니페스트](src/vault101/AndroidManifest.xml)를 읽어보면 서비스가 돌아가고 있다.

```xml
<service android:name="com.sctf2020.vault101.VaultService" android:enabled="true" android:exported="true"/>
<activity android:name="com.sctf2020.vault101.MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
        <category android:name="android.intent.category.LAUNCHER"/>
    </intent-filter>
</activity>
```

[메인 엑티비티 파일](src/vault101/MainActivity.java)에 onClick을 보면 
```java
boolean a2 = this.s.a(this.p.getText().toString());
```
이런 부분이 있고, 앞뒤를 보면 a2를 true로 만들어야 할 것 같다.

s는 Service로 초기화 되어있고, 
s.a의 구현부는 [`VaultService.java`](src/vault101/VaultService.java)에서 확인할 수 있다.

뭔가... 많이 복잡하다.

간단하게 앱을 하나 만들어서 해결하는 방법이 있겠지만 하나하나 분석을 하겠다.

```java
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
```
[`b.c.a.c.d`](src/vault101/c.java)

