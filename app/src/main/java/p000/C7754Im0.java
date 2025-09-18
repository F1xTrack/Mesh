package p000;

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
public final /* synthetic */ class C7754Im0 implements Provider, InterfaceC8590Yo0, InterfaceC6560oZ, InterfaceC11821yc1, S50, InterfaceC1777bJ, InterfaceC6227jH, InterfaceC11423vU0, InterfaceC6587oy, InterfaceC11382v91, InterfaceC9005cd1 {

    /* renamed from: b */
    public static final C7754Im0 f5141b = new C7754Im0(24);

    /* renamed from: c */
    public static final C7754Im0 f5142c = new C7754Im0(25);

    /* renamed from: d */
    public static final C7754Im0 f5143d = new C7754Im0(26);

    /* renamed from: e */
    public static final C7754Im0 f5144e = new C7754Im0(27);

    /* renamed from: f */
    public static final C7754Im0 f5145f = new C7754Im0(28);

    /* renamed from: a */
    public final /* synthetic */ int f5146a;

    public /* synthetic */ C7754Im0(int i) {
        this.f5146a = i;
    }

    @Override // p000.InterfaceC8590Yo0
    /* renamed from: a */
    public int mo2069a(Object obj) {
        C8018No0 c8018No0 = (C8018No0) obj;
        switch (this.f5146a) {
            case 5:
                String str = c8018No0.f8009a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (AbstractC7485Dh1.f2166a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return c8018No0.f8009a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    @Override // p000.InterfaceC6560oZ, p000.InterfaceC11821yc1
    public Object apply(Object obj) {
        switch (this.f5146a) {
            case 7:
                return Long.valueOf(((C7122xB) obj).f45433b);
            case 8:
                return Long.valueOf(((C7122xB) obj).f45434c);
            case 9:
                return P70.m6234u(AbstractC10978s10.m24577b(((InterfaceC11973zp0) obj).mo1888q().f10322b, new C7754Im0(23)));
            case 10:
                C7400Br0 c7400Br0 = (C7400Br0) obj;
                c7400Br0.getClass();
                C8539Xo1 c8539Xo1 = RF0.f10095a;
                c8539Xo1.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c8539Xo1.m9152v(c7400Br0, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 12:
                return (C7993Nb1) obj;
            case 19:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C8539Xo1 c8539Xo1M7707a = C1236Te.m7707a();
                        c8539Xo1M7707a.m9134Q(cursorRawQuery.getString(1));
                        c8539Xo1M7707a.f13983d = AbstractC11770yD0.m26101b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c8539Xo1M7707a.f13982c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c8539Xo1M7707a.m9144m());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 21:
                return P70.m6229B(Integer.valueOf(((C1375Vr) obj).f12802a));
            default:
                return Integer.valueOf(((C8149Qb1) obj).f9689c);
        }
    }

    @Override // p000.InterfaceC6587oy
    /* renamed from: b */
    public void mo4000b(Object obj) {
        ((C8732aV0) obj).f15537b.release();
    }

    @Override // p000.S50
    /* renamed from: c */
    public boolean mo4001c(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // p000.InterfaceC9005cd1
    /* renamed from: d */
    public void mo4002d(Exception exc) {
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f5146a) {
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

    @Override // p000.InterfaceC6227jH
    /* renamed from: h */
    public void mo410h(InterfaceC9347fG0 interfaceC9347fG0) {
    }

    public /* synthetic */ C7754Im0(FrameLayout frameLayout, int i) {
        this.f5146a = i;
    }
}
