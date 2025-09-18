package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.widget.FrameLayout;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Provider;

/* renamed from: Im0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0681Im0 implements Provider, InterfaceC1934Yo0, InterfaceC6290oZ, InterfaceC8207yc1, S50, InterfaceC2300bJ, InterfaceC5281jH, InterfaceC7612vU0, InterfaceC6365oy, InterfaceC7550v91, InterfaceC2552cd1 {
    public static final C0681Im0 b = new C0681Im0(24);
    public static final C0681Im0 c = new C0681Im0(25);
    public static final C0681Im0 d = new C0681Im0(26);
    public static final C0681Im0 e = new C0681Im0(27);
    public static final C0681Im0 f = new C0681Im0(28);
    public final /* synthetic */ int a;

    public /* synthetic */ C0681Im0(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC1934Yo0
    public int a(Object obj) {
        C1076No0 c1076No0 = (C1076No0) obj;
        switch (this.a) {
            case 5:
                String str = c1076No0.a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC0277Dh1.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c1076No0.a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // defpackage.InterfaceC6290oZ, defpackage.InterfaceC8207yc1
    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                return Long.valueOf(((C7934xB) obj).b);
            case 8:
                return Long.valueOf(((C7934xB) obj).c);
            case 9:
                return P70.u(AbstractC6949s10.b(((InterfaceC8435zp0) obj).q().b, new C0681Im0(23)));
            case 10:
                C0150Br0 c0150Br0 = (C0150Br0) obj;
                c0150Br0.getClass();
                C1857Xo1 c1857Xo1 = RF0.a;
                c1857Xo1.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c1857Xo1.v(c0150Br0, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 12:
                return (C1038Nb1) obj;
            case 19:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C1857Xo1 c1857Xo1A = C1513Te.a();
                        c1857Xo1A.Q(cursorRawQuery.getString(1));
                        c1857Xo1A.d = AbstractC8131yD0.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c1857Xo1A.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c1857Xo1A.m());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 21:
                return P70.B(Integer.valueOf(((C1708Vr) obj).a));
            default:
                return Integer.valueOf(((C1272Qb1) obj).c);
        }
    }

    @Override // defpackage.InterfaceC6365oy
    public void b(Object obj) {
        ((C2146aV0) obj).b.release();
    }

    @Override // defpackage.S50
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // defpackage.InterfaceC2552cd1
    public void d(Exception exc) {
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 0:
                return new ReactVirtualTextViewManager();
            case 1:
                return new ReactUnimplementedViewManager();
            case 2:
                return new ReactHorizontalScrollViewManager();
            case 3:
                return new ReactHorizontalScrollContainerViewManager();
            case 4:
                return new ReactProgressBarViewManager();
            case 16:
                return new RNGestureHandlerRootViewManager();
            default:
                return new RNGestureHandlerButtonViewManager();
        }
    }

    @Override // defpackage.InterfaceC5281jH
    public void h(InterfaceC3739fG0 interfaceC3739fG0) {
    }

    public /* synthetic */ C0681Im0(FrameLayout frameLayout, int i) {
        this.a = i;
    }
}
