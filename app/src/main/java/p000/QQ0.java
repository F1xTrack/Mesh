package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public class QQ0 implements InterfaceC8490Wq0, InterfaceC7814Jq0, InterfaceC8398Uw0, InterfaceC4243iS, V01, InterfaceC7272zZ, InterfaceC1670aX, InterfaceC10699pq0, InterfaceC6411mC, InterfaceC8276Sn0, InterfaceC11500w50, WD0 {

    /* renamed from: b */
    public static QQ0 f9618b;

    /* renamed from: a */
    public Object f9619a;

    public /* synthetic */ QQ0(Object obj) {
        this.f9619a = obj;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: A */
    public InterfaceC7272zZ mo755A(AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(abstractC7742Ig0, "type");
        return this;
    }

    @Override // p000.InterfaceC7814Jq0
    /* renamed from: B */
    public void mo4453B(MenuC7450Cq0 menuC7450Cq0, C7866Kq0 c7866Kq0) {
        ViewOnKeyListenerC0053Aq viewOnKeyListenerC0053Aq = (ViewOnKeyListenerC0053Aq) this.f9619a;
        viewOnKeyListenerC0053Aq.f402f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0053Aq.f404h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC7450Cq0 == ((C7289zq) arrayList.get(i)).f47025b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0053Aq.f402f.postAtTime(new RunnableC6704qp(this, i2 < arrayList.size() ? (C7289zq) arrayList.get(i2) : null, c7866Kq0, menuC7450Cq0, 1, false), menuC7450Cq0, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: D */
    public InterfaceC7272zZ mo757D(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "name");
        return this;
    }

    /* renamed from: F */
    public C1009Q1 mo6687F(int i) {
        return null;
    }

    /* renamed from: G */
    public C1009Q1 mo6688G(int i) {
        return null;
    }

    /* renamed from: H */
    public C7068wK m6689H(C1778bK c1778bK) {
        ((C4049fN) this.f9619a).getClass();
        int i = c1778bK.f16972a;
        C1657aK c1657aK = c1778bK.f16974c;
        String str = c1778bK.f16973b;
        C7356Av0 c7356Av0 = c1778bK.f16979h;
        C0086BM c0086bm = new C0086BM(i, c1657aK, str, c7356Av0);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new C7068wK(c0086bm, c1778bK.f16978g, new C7005vK(c1778bK.f16977f, c1778bK.f16976e, c1778bK.f16975d), c1778bK.f16980i, c7356Av0, executorServiceNewSingleThreadExecutor);
    }

    /* renamed from: I */
    public Set mo2777I() {
        return Collections.emptySet();
    }

    /* renamed from: J */
    public boolean mo6690J(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6691K(p000.OO0 r9, p000.C11649xG0 r10, p000.C11649xG0 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f9619a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.getClass()
            r1 = 0
            r9.m6058o(r1)
            wO0 r1 = r0.f16483M
            r2 = r1
            XF r2 = (p000.C1463XF) r2
            if (r10 == 0) goto L2b
            r2.getClass()
            int r4 = r10.f45508b
            int r6 = r11.f45508b
            if (r4 != r6) goto L21
            int r1 = r10.f45509c
            int r3 = r11.f45509c
            if (r1 == r3) goto L2b
        L21:
            int r5 = r10.f45509c
            int r7 = r11.f45509c
            r3 = r9
            boolean r9 = r2.m8957g(r3, r4, r5, r6, r7)
            goto L3a
        L2b:
            r2.m8961l(r9)
            android.view.View r10 = r9.f8408a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f13636i
            r10.add(r9)
            r9 = 1
        L3a:
            if (r9 == 0) goto L3f
            r0.m10255W()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.QQ0.m6691K(OO0, xG0, xG0):void");
    }

    /* renamed from: L */
    public void m6692L(OO0 oo0, C11649xG0 c11649xG0, C11649xG0 c11649xG02) {
        boolean zM8957g;
        RecyclerView recyclerView = (RecyclerView) this.f9619a;
        recyclerView.f16498c.m2629l(oo0);
        recyclerView.m10266h(oo0);
        oo0.m6058o(false);
        C1463XF c1463xf = (C1463XF) recyclerView.f16483M;
        c1463xf.getClass();
        int i = c11649xG0.f45508b;
        int i2 = c11649xG0.f45509c;
        View view = oo0.f8408a;
        int left = c11649xG02 == null ? view.getLeft() : c11649xG02.f45508b;
        int top = c11649xG02 == null ? view.getTop() : c11649xG02.f45509c;
        if (oo0.m6052i() || (i == left && i2 == top)) {
            c1463xf.m8961l(oo0);
            c1463xf.f13635h.add(oo0);
            zM8957g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM8957g = c1463xf.m8957g(oo0, i, i2, left, top);
        }
        if (zM8957g) {
            recyclerView.m10255W();
        }
    }

    @Override // p000.InterfaceC1670aX
    /* renamed from: W */
    public Cursor mo6693W(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9619a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: a */
    public InterfaceC0036AZ mo759a() {
        return (C1535YO) this.f9619a;
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: b */
    public AttributedCharacterIterator mo6694b(double d) {
        return ((DateFormat) this.f9619a).formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        Constructor constructor = (Constructor) this.f9619a;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            QP1 qp1 = PP0.f9065a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + PP0.m6360b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + PP0.m6360b(constructor) + "' with no args", e3.getCause());
        }
    }

    @Override // p000.InterfaceC1670aX
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9619a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: d */
    public void mo861d(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f9619a).getClass();
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: e */
    public String mo6695e(double d) {
        return ((DateFormat) this.f9619a).format(new Date((long) d));
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: f */
    public void mo1906f(MenuC7450Cq0 menuC7450Cq0, boolean z) {
        ((LayoutInflaterFactory2C0448H6) this.f9619a).m3290r(menuC7450Cq0);
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: f0 */
    public String mo6696f0(Y40 y40) {
        return Calendar.getInstance((Locale) y40.mo5826g()).getTimeZone().getID();
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: g */
    public String mo6697g(Y40 y40) {
        return "latn";
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C3974eB((Context) ((C7668Gv0) this.f9619a).f3961a, new C8326Tm0(23), new C7564Ev0(22));
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: h */
    public String mo6698h(Y40 y40) {
        return DateFormat.getDateInstance(3, (Locale) y40.mo5826g()).getCalendar().toString();
    }

    @Override // p000.WD0
    /* renamed from: i */
    public void mo6699i(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.f9619a).setResultCode(i);
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: i0 */
    public String mo6700i0(AttributedCharacterIterator.Attribute attribute, String str) throws NumberFormatException {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? LocalNotification.Repeat.Type.DAY : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? LocalNotification.Repeat.Type.HOUR : attribute == DateFormat.Field.MINUTE ? LocalNotification.Repeat.Type.MINUTE : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // p000.InterfaceC6411mC
    /* renamed from: k */
    public Iterable mo2553k(Object obj) {
        C8618Zc0 c8618Zc0 = (C8618Zc0) this.f9619a;
        O90.m5968f(c8618Zc0, "this$0");
        Collection collectionMo5276b = ((InterfaceC6976us) obj).mo1439v().mo5276b();
        O90.m5967e(collectionMo5276b, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionMo5276b.iterator();
        while (it.hasNext()) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = ((AbstractC7742Ig0) it.next()).mo3797E().mo1962a();
            C11957zh0 c11957zh0M9553a = null;
            InterfaceC0873Ns interfaceC0873NsMo2089x1 = interfaceC0873NsMo1962a != null ? interfaceC0873NsMo1962a.mo2089x1() : null;
            InterfaceC6976us interfaceC6976us = interfaceC0873NsMo2089x1 instanceof InterfaceC6976us ? (InterfaceC6976us) interfaceC0873NsMo2089x1 : null;
            if (interfaceC6976us != null && (c11957zh0M9553a = c8618Zc0.m9553a(interfaceC6976us)) == null) {
                c11957zh0M9553a = interfaceC6976us;
            }
            if (c11957zh0M9553a != null) {
                arrayList.add(c11957zh0M9553a);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: l */
    public EnumC10477o50 mo6701l(Y40 y40) {
        EnumC10477o50 enumC10477o50 = EnumC10477o50.f38793d;
        try {
            String pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) y40.mo5826g())).toPattern();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (int i = 0; i < pattern.length(); i++) {
                char cCharAt = pattern.charAt(i);
                if (cCharAt == '\'') {
                    z = !z;
                } else if (!z && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb.append(pattern.charAt(i));
                }
            }
            String string = sb.toString();
            return string.contains(String.valueOf('h')) ? EnumC10477o50.f38791b : string.contains(String.valueOf('K')) ? EnumC10477o50.f38790a : string.contains(String.valueOf('H')) ? EnumC10477o50.f38792c : enumC10477o50;
        } catch (ClassCastException unused) {
            return enumC10477o50;
        }
    }

    @Override // p000.V01
    public void lock() {
        ((Lock) this.f9619a).lock();
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: m */
    public void mo868m(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f9619a).getClass();
    }

    @Override // p000.InterfaceC7814Jq0
    /* renamed from: n */
    public void mo4454n(MenuC7450Cq0 menuC7450Cq0, C7866Kq0 c7866Kq0) {
        ((ViewOnKeyListenerC0053Aq) this.f9619a).f402f.removeCallbacksAndMessages(menuC7450Cq0);
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: o */
    public InterfaceC7272zZ mo761o(int i) {
        AbstractC0852NX.m5764m(i, "kind");
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: q */
    public InterfaceC7272zZ mo763q(InterfaceC6976us interfaceC6976us) {
        O90.m5968f(interfaceC6976us, "owner");
        return this;
    }

    @Override // p000.InterfaceC8490Wq0
    /* renamed from: q0 */
    public boolean mo1907q0(MenuC7450Cq0 menuC7450Cq0) {
        Window.Callback callback = ((LayoutInflaterFactory2C0448H6) this.f9619a).f4092l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC7450Cq0);
        return true;
    }

    @Override // p000.InterfaceC11500w50
    /* renamed from: s0 */
    public void mo6702s0(Y40 y40, String str, String str2, EnumC11245u50 enumC11245u50, EnumC10093l50 enumC10093l50, EnumC11373v50 enumC11373v50, EnumC10733q50 enumC10733q50, EnumC9965k50 enumC9965k50, EnumC10349n50 enumC10349n50, EnumC10605p50 enumC10605p50, EnumC10861r50 enumC10861r50, EnumC11117t50 enumC11117t50, EnumC10477o50 enumC10477o50, String str3, EnumC9837j50 enumC9837j50, EnumC10989s50 enumC10989s50, Object obj) {
        if (!str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            y40.mo5825f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str2);
            y40.mo5825f("nu", arrayList2);
        }
        boolean z = true;
        boolean z2 = (enumC11373v50 == null && enumC10733q50 == null && enumC9965k50 == null) ? false : true;
        if (enumC10349n50 == null && enumC10605p50 == null && enumC10861r50 == null) {
            z = false;
        }
        if (z2 && z) {
            this.f9619a = DateFormat.getDateTimeInstance(0, 0, (Locale) y40.mo5826g());
        } else if (z2) {
            this.f9619a = DateFormat.getDateInstance(0, (Locale) y40.mo5826g());
        } else if (z) {
            this.f9619a = DateFormat.getTimeInstance(0, (Locale) y40.mo5826g());
        }
        ((DateFormat) this.f9619a).setTimeZone(TimeZone.getTimeZone(str3));
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: u */
    public InterfaceC7272zZ mo767u(InterfaceC0510I5 interfaceC0510I5) {
        O90.m5968f(interfaceC0510I5, "additionalAnnotations");
        return this;
    }

    @Override // p000.V01
    public void unlock() {
        ((Lock) this.f9619a).unlock();
    }

    @Override // p000.InterfaceC10699pq0
    /* renamed from: v */
    public void mo877v(InterfaceC4199hl interfaceC4199hl) {
        ((C7512Dv0) this.f9619a).getClass();
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: w */
    public InterfaceC7272zZ mo768w(C7003vI c7003vI) {
        O90.m5968f(c7003vI, "visibility");
        return this;
    }

    public QQ0(int i) {
        switch (i) {
            case 3:
                this.f9619a = new CopyOnWriteArrayList();
                break;
            case 19:
                this.f9619a = new C6308kZ(5, 1.0f, false);
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f9619a = new C1071R1(this);
                    break;
                } else {
                    this.f9619a = new C1134S1(this);
                    break;
                }
        }
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: C */
    public InterfaceC7272zZ mo756C() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: E */
    public InterfaceC7272zZ mo758E() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: r */
    public InterfaceC7272zZ mo764r() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: s */
    public InterfaceC7272zZ mo765s() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: t */
    public InterfaceC7272zZ mo766t() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: x */
    public InterfaceC7272zZ mo769x() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: z */
    public InterfaceC7272zZ mo771z() {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: j */
    public InterfaceC7272zZ mo760j(List list) {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: p */
    public InterfaceC7272zZ mo762p(C10937rh0 c10937rh0) {
        return this;
    }

    @Override // p000.InterfaceC7272zZ
    /* renamed from: y */
    public InterfaceC7272zZ mo770y(EnumC10575os0 enumC10575os0) {
        return this;
    }
}
