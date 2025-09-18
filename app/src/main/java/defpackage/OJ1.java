package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.dylanvann.fastimage.GlideRequests;
import com.facebook.react.views.view.a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class OJ1 implements InterfaceC5839mC, InterfaceC1836Xh1, InterfaceC7364uB0, InterfaceC1651Uy, InterfaceC5559kk, InterfaceC8256yt, InterfaceC1646Uw0, MR0, InterfaceC1839Xi1, InterfaceC6053nJ1 {
    public static final OJ1 b = new OJ1(1);
    public static final OJ1 c = new OJ1(2);
    public static final OJ1 d = new OJ1(4);
    public static final OJ1 e = new OJ1(5);
    public static final /* synthetic */ OJ1 f = new OJ1(6);
    public final /* synthetic */ int a;

    public /* synthetic */ OJ1(int i) {
        this.a = i;
    }

    public static AbstractC1043Nd0 e(String str) {
        EnumC7066sd0 enumC7066sd0;
        AbstractC1043Nd0 c0888Ld0;
        O90.f(str, "representation");
        char cCharAt = str.charAt(0);
        EnumC7066sd0[] enumC7066sd0ArrValues = EnumC7066sd0.values();
        int length = enumC7066sd0ArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC7066sd0 = null;
                break;
            }
            enumC7066sd0 = enumC7066sd0ArrValues[i];
            if (enumC7066sd0.c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (enumC7066sd0 != null) {
            return new C0965Md0(enumC7066sd0);
        }
        if (cCharAt == 'V') {
            return new C0965Md0(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            O90.e(strSubstring, "substring(...)");
            c0888Ld0 = new C0810Kd0(e(strSubstring));
        } else {
            if (cCharAt == 'L') {
                AbstractC7538v51.v(str, ';');
            }
            String strSubstring2 = str.substring(1, str.length() - 1);
            O90.e(strSubstring2, "substring(...)");
            c0888Ld0 = new C0888Ld0(strSubstring2);
        }
        return c0888Ld0;
    }

    public static C0888Ld0 f(String str) {
        O90.f(str, "internalName");
        return new C0888Ld0(str);
    }

    public static View i(ViewGroup viewGroup, int i) {
        O90.f(viewGroup, "parent");
        if (viewGroup instanceof a) {
            View childAt = viewGroup.getChildAt(((a) viewGroup).getZIndexMappedChildIndex(i));
            O90.c(childAt);
            return childAt;
        }
        View childAt2 = viewGroup.getChildAt(i);
        O90.e(childAt2, "getChildAt(...)");
        return childAt2;
    }

    public static String j(AbstractC1043Nd0 abstractC1043Nd0) {
        String strC;
        O90.f(abstractC1043Nd0, "type");
        if (abstractC1043Nd0 instanceof C0810Kd0) {
            return "[" + j(((C0810Kd0) abstractC1043Nd0).i);
        }
        if (abstractC1043Nd0 instanceof C0965Md0) {
            EnumC7066sd0 enumC7066sd0 = ((C0965Md0) abstractC1043Nd0).i;
            return (enumC7066sd0 == null || (strC = enumC7066sd0.c()) == null) ? "V" : strC;
        }
        if (abstractC1043Nd0 instanceof C0888Ld0) {
            return F91.v(new StringBuilder("L"), ((C0888Ld0) abstractC1043Nd0).i, ';');
        }
        throw new C7074sg();
    }

    @Override // defpackage.InterfaceC5559kk
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.InterfaceC7364uB0
    public boolean b(InterfaceC7492us interfaceC7492us, UI ui) {
        O90.f(interfaceC7492us, "classDescriptor");
        return !ui.getAnnotations().g(AbstractC7555vB0.a);
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new ConcurrentHashMap();
    }

    @Override // defpackage.MR0
    public JR0 d(com.bumptech.glide.a aVar, InterfaceC0279Di0 interfaceC0279Di0, OR0 or0, Context context) {
        return new GlideRequests(aVar, interfaceC0279Di0, or0, context);
    }

    @Override // defpackage.InterfaceC5559kk
    public Object h(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.InterfaceC5839mC
    public Iterable k(Object obj) {
        int i = AbstractC7384uI.a;
        Collection collectionJ = ((C1758Wh1) obj).j();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(collectionJ));
        Iterator it = ((ArrayList) collectionJ).iterator();
        while (it.hasNext()) {
            arrayList.add(((C1758Wh1) it.next()).x1());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1839Xi1
    public void o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // defpackage.InterfaceC8256yt
    public void q(C6946s01 c6946s01, Throwable th) {
        Object objD = c6946s01.d();
        AbstractC3393dS.o(AbstractC8446zt.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c6946s01)), objD == null ? null : objD.getClass().getName());
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.a;
        return null;
    }

    @Override // defpackage.InterfaceC1836Xh1
    public Object z(AbstractC8396zc0 abstractC8396zc0, float f2) {
        return Float.valueOf(AbstractC0651Ic0.d(abstractC8396zc0) * f2);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.g.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                Long l = (Long) UW1.L.a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l2 = (Long) UW1.w.a();
                l2.getClass();
                return l2;
            default:
                C4176hY1.b.get();
                return Integer.valueOf((int) ((Long) C6480pY1.d.a()).longValue());
        }
    }

    public OJ1(Context context, C0681Im0 c0681Im0) {
        this.a = 23;
        O90.f(context, "context");
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new N00(2, this));
    }

    @Override // defpackage.InterfaceC8256yt
    public void g() {
    }
}
