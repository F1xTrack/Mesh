package defpackage;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: yL0 */
/* loaded from: classes.dex */
public final class RunnableC8155yL0 extends BroadcastReceiver implements Runnable {
    public final C4136hL0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public final ReadableArray g;
    public final ReadableMap h;
    public final Callback i;
    public long j;
    public C3945gL0 k;
    public int l;
    public final int m;
    public WritableMap o;
    public final C6363ox0 r;
    public boolean s;
    public ScheduledFuture u;
    public static final HashMap w = new HashMap();
    public static final HashMap x = new HashMap();
    public static final HashMap y = new HashMap();
    public static final HashMap z = new HashMap();
    public static final C1016Mu0 A = new C1016Mu0(8);
    public int n = 1;
    public boolean p = false;
    public final ArrayList q = new ArrayList();
    public final ScheduledExecutorService t = Executors.newScheduledThreadPool(1);
    public final Handler v = new Handler(new C7775wL0(this));

    /* JADX WARN: Removed duplicated region for block: B:174:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RunnableC8155yL0(com.facebook.react.bridge.ReadableMap r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.facebook.react.bridge.ReadableMap r18, java.lang.String r19, com.facebook.react.bridge.ReadableArray r20, defpackage.C6363ox0 r21, com.facebook.react.bridge.Callback r22) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC8155yL0.<init>(com.facebook.react.bridge.ReadableMap, java.lang.String, java.lang.String, java.lang.String, com.facebook.react.bridge.ReadableMap, java.lang.String, com.facebook.react.bridge.ReadableArray, ox0, com.facebook.react.bridge.Callback):void");
    }

    public static void a(String str) {
        HashMap map = w;
        InterfaceC7089sl interfaceC7089sl = (InterfaceC7089sl) map.get(str);
        if (interfaceC7089sl != null) {
            ((DN0) interfaceC7089sl).e();
            map.remove(str);
        }
        HashMap map2 = x;
        if (map2.containsKey(str)) {
            ((DownloadManager) C7394uL0.b.getApplicationContext().getSystemService("download")).remove(((Long) map2.get(str)).longValue());
        }
    }

    public static String b(K20 k20, String str) {
        String strB = k20.b(str);
        if (strB != null) {
            return strB;
        }
        Locale locale = Locale.ROOT;
        return k20.b(str.toLowerCase(locale)) == null ? "" : k20.b(str.toLowerCase(locale));
    }

    public static String c(String str, HashMap map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) map.get(str.toLowerCase(Locale.ROOT));
        return str3 == null ? "" : str3;
    }

    public final WritableMap d(HS0 hs0, boolean z2) {
        K20 k20;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("status", hs0.d);
        writableMapCreateMap.putString("state", "2");
        writableMapCreateMap.putString("taskId", this.b);
        writableMapCreateMap.putBoolean("timeout", this.p);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        int i = 0;
        while (true) {
            k20 = hs0.f;
            if (i >= k20.size()) {
                break;
            }
            writableMapCreateMap2.putString(k20.d(i), k20.q(i));
            i++;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString((String) it.next());
        }
        writableMapCreateMap.putArray("redirects", writableArrayCreateArray);
        writableMapCreateMap.putMap("headers", writableMapCreateMap2);
        if (z2) {
            writableMapCreateMap.putString("respType", "blob");
        } else if (b(k20, "content-type").equalsIgnoreCase("text/")) {
            writableMapCreateMap.putString("respType", "text");
        } else if (b(k20, "content-type").contains("application/json")) {
            writableMapCreateMap.putString("respType", "json");
        } else {
            writableMapCreateMap.putString("respType", "");
        }
        return writableMapCreateMap;
    }

    public final void e(Object... objArr) {
        if (this.s) {
            return;
        }
        this.i.invoke(objArr);
        this.s = true;
    }

    public final void f() {
        HashMap map = w;
        String str = this.b;
        if (map.containsKey(str)) {
            map.remove(str);
        }
        HashMap map2 = x;
        if (map2.containsKey(str)) {
            map2.remove(str);
        }
        HashMap map3 = z;
        if (map3.containsKey(str)) {
            map3.remove(str);
        }
        HashMap map4 = y;
        if (map4.containsKey(str)) {
            map4.remove(str);
        }
        C3945gL0 c3945gL0 = this.k;
        if (c3945gL0 != null) {
            c3945gL0.getClass();
            try {
                File file = c3945gL0.g;
                if (file == null || !file.exists()) {
                    return;
                }
                c3945gL0.g.delete();
            } catch (Exception e) {
                AL0.a(e.getLocalizedMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC8155yL0.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:367:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02b7 A[Catch: Exception -> 0x0327, TryCatch #9 {Exception -> 0x0327, blocks: (B:379:0x02af, B:381:0x02b7, B:383:0x02c5, B:385:0x02d7, B:389:0x02e7, B:392:0x02ee, B:394:0x02f5, B:396:0x02ff, B:397:0x0302, B:399:0x0311, B:401:0x0319, B:402:0x031c, B:403:0x031f, B:404:0x0326, B:407:0x032a, B:408:0x032c, B:410:0x0342, B:411:0x034a, B:415:0x0357, B:417:0x035e, B:418:0x0362, B:420:0x0368, B:422:0x0378, B:424:0x0380, B:425:0x0384, B:427:0x038c, B:428:0x0390, B:429:0x03a1, B:432:0x03af, B:434:0x03b5, B:437:0x03bc, B:470:0x0444, B:496:0x0540, B:498:0x0563, B:499:0x056d, B:479:0x0465, B:481:0x046b, B:483:0x0471, B:486:0x0479, B:487:0x047e, B:488:0x0489, B:489:0x04b0, B:490:0x04d6, B:495:0x0522, B:494:0x050a, B:439:0x03c3, B:441:0x03cf, B:451:0x03ef, B:453:0x03f7, B:456:0x0403, B:458:0x0411, B:461:0x041e, B:462:0x0422, B:464:0x0432, B:465:0x0435, B:467:0x043b, B:468:0x043e, B:469:0x0442, B:444:0x03d7, B:446:0x03dd, B:448:0x03e5, B:449:0x03ea, B:414:0x0354, B:504:0x05ae, B:505:0x05b3, B:501:0x05a5, B:502:0x05ac, B:491:0x04fc), top: B:518:0x02af, inners: #0, #2, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03ef A[Catch: Exception -> 0x0327, TryCatch #9 {Exception -> 0x0327, blocks: (B:379:0x02af, B:381:0x02b7, B:383:0x02c5, B:385:0x02d7, B:389:0x02e7, B:392:0x02ee, B:394:0x02f5, B:396:0x02ff, B:397:0x0302, B:399:0x0311, B:401:0x0319, B:402:0x031c, B:403:0x031f, B:404:0x0326, B:407:0x032a, B:408:0x032c, B:410:0x0342, B:411:0x034a, B:415:0x0357, B:417:0x035e, B:418:0x0362, B:420:0x0368, B:422:0x0378, B:424:0x0380, B:425:0x0384, B:427:0x038c, B:428:0x0390, B:429:0x03a1, B:432:0x03af, B:434:0x03b5, B:437:0x03bc, B:470:0x0444, B:496:0x0540, B:498:0x0563, B:499:0x056d, B:479:0x0465, B:481:0x046b, B:483:0x0471, B:486:0x0479, B:487:0x047e, B:488:0x0489, B:489:0x04b0, B:490:0x04d6, B:495:0x0522, B:494:0x050a, B:439:0x03c3, B:441:0x03cf, B:451:0x03ef, B:453:0x03f7, B:456:0x0403, B:458:0x0411, B:461:0x041e, B:462:0x0422, B:464:0x0432, B:465:0x0435, B:467:0x043b, B:468:0x043e, B:469:0x0442, B:444:0x03d7, B:446:0x03dd, B:448:0x03e5, B:449:0x03ea, B:414:0x0354, B:504:0x05ae, B:505:0x05b3, B:501:0x05a5, B:502:0x05ac, B:491:0x04fc), top: B:518:0x02af, inners: #0, #2, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x04d6 A[Catch: Exception -> 0x0327, TRY_LEAVE, TryCatch #9 {Exception -> 0x0327, blocks: (B:379:0x02af, B:381:0x02b7, B:383:0x02c5, B:385:0x02d7, B:389:0x02e7, B:392:0x02ee, B:394:0x02f5, B:396:0x02ff, B:397:0x0302, B:399:0x0311, B:401:0x0319, B:402:0x031c, B:403:0x031f, B:404:0x0326, B:407:0x032a, B:408:0x032c, B:410:0x0342, B:411:0x034a, B:415:0x0357, B:417:0x035e, B:418:0x0362, B:420:0x0368, B:422:0x0378, B:424:0x0380, B:425:0x0384, B:427:0x038c, B:428:0x0390, B:429:0x03a1, B:432:0x03af, B:434:0x03b5, B:437:0x03bc, B:470:0x0444, B:496:0x0540, B:498:0x0563, B:499:0x056d, B:479:0x0465, B:481:0x046b, B:483:0x0471, B:486:0x0479, B:487:0x047e, B:488:0x0489, B:489:0x04b0, B:490:0x04d6, B:495:0x0522, B:494:0x050a, B:439:0x03c3, B:441:0x03cf, B:451:0x03ef, B:453:0x03f7, B:456:0x0403, B:458:0x0411, B:461:0x041e, B:462:0x0422, B:464:0x0432, B:465:0x0435, B:467:0x043b, B:468:0x043e, B:469:0x0442, B:444:0x03d7, B:446:0x03dd, B:448:0x03e5, B:449:0x03ea, B:414:0x0354, B:504:0x05ae, B:505:0x05b3, B:501:0x05a5, B:502:0x05ac, B:491:0x04fc), top: B:518:0x02af, inners: #0, #2, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0563 A[Catch: Exception -> 0x0327, TryCatch #9 {Exception -> 0x0327, blocks: (B:379:0x02af, B:381:0x02b7, B:383:0x02c5, B:385:0x02d7, B:389:0x02e7, B:392:0x02ee, B:394:0x02f5, B:396:0x02ff, B:397:0x0302, B:399:0x0311, B:401:0x0319, B:402:0x031c, B:403:0x031f, B:404:0x0326, B:407:0x032a, B:408:0x032c, B:410:0x0342, B:411:0x034a, B:415:0x0357, B:417:0x035e, B:418:0x0362, B:420:0x0368, B:422:0x0378, B:424:0x0380, B:425:0x0384, B:427:0x038c, B:428:0x0390, B:429:0x03a1, B:432:0x03af, B:434:0x03b5, B:437:0x03bc, B:470:0x0444, B:496:0x0540, B:498:0x0563, B:499:0x056d, B:479:0x0465, B:481:0x046b, B:483:0x0471, B:486:0x0479, B:487:0x047e, B:488:0x0489, B:489:0x04b0, B:490:0x04d6, B:495:0x0522, B:494:0x050a, B:439:0x03c3, B:441:0x03cf, B:451:0x03ef, B:453:0x03f7, B:456:0x0403, B:458:0x0411, B:461:0x041e, B:462:0x0422, B:464:0x0432, B:465:0x0435, B:467:0x043b, B:468:0x043e, B:469:0x0442, B:444:0x03d7, B:446:0x03dd, B:448:0x03e5, B:449:0x03ea, B:414:0x0354, B:504:0x05ae, B:505:0x05b3, B:501:0x05a5, B:502:0x05ac, B:491:0x04fc), top: B:518:0x02af, inners: #0, #2, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x05a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC8155yL0.run():void");
    }
}
