package defpackage;

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
import com.huawei.hms.rn.push.constants.LocalNotification;
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
public class QQ0 implements InterfaceC1784Wq0, InterfaceC0771Jq0, InterfaceC1646Uw0, InterfaceC4347iS, V01, InterfaceC8386zZ, InterfaceC2151aX, InterfaceC6533pq0, InterfaceC5839mC, InterfaceC1463Sn0, InterfaceC7727w50, WD0 {
    public static QQ0 b;
    public Object a;

    public /* synthetic */ QQ0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ A(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "type");
        return this;
    }

    @Override // defpackage.InterfaceC0771Jq0
    public void B(MenuC0225Cq0 menuC0225Cq0, C0849Kq0 c0849Kq0) {
        ViewOnKeyListenerC0068Aq viewOnKeyListenerC0068Aq = (ViewOnKeyListenerC0068Aq) this.a;
        viewOnKeyListenerC0068Aq.f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0068Aq.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0225Cq0 == ((C8437zq) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0068Aq.f.postAtTime(new RunnableC6720qp(this, i2 < arrayList.size() ? (C8437zq) arrayList.get(i2) : null, c0849Kq0, menuC0225Cq0, 1, false), menuC0225Cq0, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ D(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "name");
        return this;
    }

    public Q1 F(int i) {
        return null;
    }

    public Q1 G(int i) {
        return null;
    }

    public C7771wK H(C2303bK c2303bK) {
        ((C3759fN) this.a).getClass();
        int i = c2303bK.a;
        C2112aK c2112aK = c2303bK.c;
        String str = c2303bK.b;
        C0084Av0 c0084Av0 = c2303bK.h;
        BM bm = new BM(i, c2112aK, str, c0084Av0);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new C7771wK(bm, c2303bK.g, new C7581vK(c2303bK.f, c2303bK.e, c2303bK.d), c2303bK.i, c0084Av0, executorServiceNewSingleThreadExecutor);
    }

    public Set I() {
        return Collections.emptySet();
    }

    public boolean J(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(defpackage.OO0 r9, defpackage.C7950xG0 r10, defpackage.C7950xG0 r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.getClass()
            r1 = 0
            r9.o(r1)
            wO0 r1 = r0.M
            r2 = r1
            XF r2 = (defpackage.XF) r2
            if (r10 == 0) goto L2b
            r2.getClass()
            int r4 = r10.b
            int r6 = r11.b
            if (r4 != r6) goto L21
            int r1 = r10.c
            int r3 = r11.c
            if (r1 == r3) goto L2b
        L21:
            int r5 = r10.c
            int r7 = r11.c
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3a
        L2b:
            r2.l(r9)
            android.view.View r10 = r9.a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.i
            r10.add(r9)
            r9 = 1
        L3a:
            if (r9 == 0) goto L3f
            r0.W()
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QQ0.K(OO0, xG0, xG0):void");
    }

    public void L(OO0 oo0, C7950xG0 c7950xG0, C7950xG0 c7950xG02) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.c.l(oo0);
        recyclerView.h(oo0);
        oo0.o(false);
        XF xf = (XF) recyclerView.M;
        xf.getClass();
        int i = c7950xG0.b;
        int i2 = c7950xG0.c;
        View view = oo0.a;
        int left = c7950xG02 == null ? view.getLeft() : c7950xG02.b;
        int top = c7950xG02 == null ? view.getTop() : c7950xG02.c;
        if (oo0.i() || (i == left && i2 == top)) {
            xf.l(oo0);
            xf.h.add(oo0);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = xf.g(oo0, i, i2, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    @Override // defpackage.InterfaceC2151aX
    public Cursor W(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // defpackage.InterfaceC8386zZ
    public AZ a() {
        return (YO) this.a;
    }

    @Override // defpackage.InterfaceC7727w50
    public AttributedCharacterIterator b(double d) {
        return ((DateFormat) this.a).formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        Constructor constructor = (Constructor) this.a;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            QP1 qp1 = PP0.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + PP0.b(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + PP0.b(constructor) + "' with no args", e3.getCause());
        }
    }

    @Override // defpackage.InterfaceC2151aX
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // defpackage.InterfaceC6533pq0
    public void d(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.a).getClass();
    }

    @Override // defpackage.InterfaceC7727w50
    public String e(double d) {
        return ((DateFormat) this.a).format(new Date((long) d));
    }

    @Override // defpackage.InterfaceC1784Wq0
    public void f(MenuC0225Cq0 menuC0225Cq0, boolean z) {
        ((H6) this.a).r(menuC0225Cq0);
    }

    @Override // defpackage.InterfaceC7727w50
    public String f0(Y40 y40) {
        return Calendar.getInstance((Locale) y40.g()).getTimeZone().getID();
    }

    @Override // defpackage.InterfaceC7727w50
    public String g(Y40 y40) {
        return "latn";
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new C3532eB((Context) ((C0552Gv0) this.a).a, new C1538Tm0(23), new C0396Ev0(22));
    }

    @Override // defpackage.InterfaceC7727w50
    public String h(Y40 y40) {
        return DateFormat.getDateInstance(3, (Locale) y40.g()).getCalendar().toString();
    }

    @Override // defpackage.WD0
    public void i(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.InterfaceC7727w50
    public String i0(AttributedCharacterIterator.Attribute attribute, String str) throws NumberFormatException {
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

    @Override // defpackage.InterfaceC5839mC
    public Iterable k(Object obj) {
        C1976Zc0 c1976Zc0 = (C1976Zc0) this.a;
        O90.f(c1976Zc0, "this$0");
        Collection collectionB = ((InterfaceC7492us) obj).v().b();
        O90.e(collectionB, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            InterfaceC1087Ns interfaceC1087NsA = ((AbstractC0663Ig0) it.next()).E().a();
            C8411zh0 c8411zh0A = null;
            InterfaceC1087Ns interfaceC1087NsX1 = interfaceC1087NsA != null ? interfaceC1087NsA.x1() : null;
            InterfaceC7492us interfaceC7492us = interfaceC1087NsX1 instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsX1 : null;
            if (interfaceC7492us != null && (c8411zh0A = c1976Zc0.a(interfaceC7492us)) == null) {
                c8411zh0A = interfaceC7492us;
            }
            if (c8411zh0A != null) {
                arrayList.add(c8411zh0A);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC7727w50
    public EnumC6201o50 l(Y40 y40) {
        EnumC6201o50 enumC6201o50 = EnumC6201o50.d;
        try {
            String pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) y40.g())).toPattern();
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
            return string.contains(String.valueOf('h')) ? EnumC6201o50.b : string.contains(String.valueOf('K')) ? EnumC6201o50.a : string.contains(String.valueOf('H')) ? EnumC6201o50.c : enumC6201o50;
        } catch (ClassCastException unused) {
            return enumC6201o50;
        }
    }

    @Override // defpackage.V01
    public void lock() {
        ((Lock) this.a).lock();
    }

    @Override // defpackage.InterfaceC6533pq0
    public void m(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.a).getClass();
    }

    @Override // defpackage.InterfaceC0771Jq0
    public void n(MenuC0225Cq0 menuC0225Cq0, C0849Kq0 c0849Kq0) {
        ((ViewOnKeyListenerC0068Aq) this.a).f.removeCallbacksAndMessages(menuC0225Cq0);
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ o(int i) {
        NX.m(i, "kind");
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ q(InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7492us, "owner");
        return this;
    }

    @Override // defpackage.InterfaceC1784Wq0
    public boolean q0(MenuC0225Cq0 menuC0225Cq0) {
        Window.Callback callback = ((H6) this.a).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC0225Cq0);
        return true;
    }

    @Override // defpackage.InterfaceC7727w50
    public void s0(Y40 y40, String str, String str2, EnumC7346u50 enumC7346u50, EnumC5628l50 enumC5628l50, EnumC7537v50 enumC7537v50, EnumC6583q50 enumC6583q50, EnumC5437k50 enumC5437k50, EnumC6010n50 enumC6010n50, EnumC6392p50 enumC6392p50, EnumC6773r50 enumC6773r50, EnumC7155t50 enumC7155t50, EnumC6201o50 enumC6201o50, String str3, EnumC5246j50 enumC5246j50, EnumC6964s50 enumC6964s50, Object obj) {
        if (!str.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            y40.f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str2);
            y40.f("nu", arrayList2);
        }
        boolean z = true;
        boolean z2 = (enumC7537v50 == null && enumC6583q50 == null && enumC5437k50 == null) ? false : true;
        if (enumC6010n50 == null && enumC6392p50 == null && enumC6773r50 == null) {
            z = false;
        }
        if (z2 && z) {
            this.a = DateFormat.getDateTimeInstance(0, 0, (Locale) y40.g());
        } else if (z2) {
            this.a = DateFormat.getDateInstance(0, (Locale) y40.g());
        } else if (z) {
            this.a = DateFormat.getTimeInstance(0, (Locale) y40.g());
        }
        ((DateFormat) this.a).setTimeZone(TimeZone.getTimeZone(str3));
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ u(I5 i5) {
        O90.f(i5, "additionalAnnotations");
        return this;
    }

    @Override // defpackage.V01
    public void unlock() {
        ((Lock) this.a).unlock();
    }

    @Override // defpackage.InterfaceC6533pq0
    public void v(InterfaceC4213hl interfaceC4213hl) {
        ((C0318Dv0) this.a).getClass();
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ w(C7575vI c7575vI) {
        O90.f(c7575vI, "visibility");
        return this;
    }

    public QQ0(int i) {
        switch (i) {
            case 3:
                this.a = new CopyOnWriteArrayList();
                break;
            case 19:
                this.a = new C5526kZ(5, 1.0f, false);
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new R1(this);
                    break;
                } else {
                    this.a = new S1(this);
                    break;
                }
        }
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ C() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ E() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ r() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ s() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ t() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ x() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ z() {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ j(List list) {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ p(C6887rh0 c6887rh0) {
        return this;
    }

    @Override // defpackage.InterfaceC8386zZ
    public InterfaceC8386zZ y(EnumC6348os0 enumC6348os0) {
        return this;
    }
}
