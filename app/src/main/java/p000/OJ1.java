package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.dylanvann.fastimage.GlideRequests;
import com.facebook.react.views.view.C1932a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class OJ1 implements InterfaceC6411mC, InterfaceC8525Xh1, InterfaceC11257uB0, InterfaceC1319Uy, InterfaceC6319kk, InterfaceC7229yt, InterfaceC8398Uw0, MR0, InterfaceC8527Xi1, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static final OJ1 f8356b = new OJ1(1);

    /* renamed from: c */
    public static final OJ1 f8357c = new OJ1(2);

    /* renamed from: d */
    public static final OJ1 f8358d = new OJ1(4);

    /* renamed from: e */
    public static final OJ1 f8359e = new OJ1(5);

    /* renamed from: f */
    public static final /* synthetic */ OJ1 f8360f = new OJ1(6);

    /* renamed from: a */
    public final /* synthetic */ int f8361a;

    public /* synthetic */ OJ1(int i) {
        this.f8361a = i;
    }

    /* renamed from: e */
    public static AbstractC7996Nd0 m6010e(String str) {
        EnumC11057sd0 enumC11057sd0;
        AbstractC7996Nd0 c7892Ld0;
        O90.m5968f(str, "representation");
        char cCharAt = str.charAt(0);
        EnumC11057sd0[] enumC11057sd0ArrValues = EnumC11057sd0.values();
        int length = enumC11057sd0ArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC11057sd0 = null;
                break;
            }
            enumC11057sd0 = enumC11057sd0ArrValues[i];
            if (enumC11057sd0.m24758c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (enumC11057sd0 != null) {
            return new C7944Md0(enumC11057sd0);
        }
        if (cCharAt == 'V') {
            return new C7944Md0(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            O90.m5967e(strSubstring, "substring(...)");
            c7892Ld0 = new C7840Kd0(m6010e(strSubstring));
        } else {
            if (cCharAt == 'L') {
                AbstractC11374v51.m25357v(str, ';');
            }
            String strSubstring2 = str.substring(1, str.length() - 1);
            O90.m5967e(strSubstring2, "substring(...)");
            c7892Ld0 = new C7892Ld0(strSubstring2);
        }
        return c7892Ld0;
    }

    /* renamed from: f */
    public static C7892Ld0 m6011f(String str) {
        O90.m5968f(str, "internalName");
        return new C7892Ld0(str);
    }

    /* renamed from: i */
    public static View m6012i(ViewGroup viewGroup, int i) {
        O90.m5968f(viewGroup, "parent");
        if (viewGroup instanceof C1932a) {
            View childAt = viewGroup.getChildAt(((C1932a) viewGroup).getZIndexMappedChildIndex(i));
            O90.m5965c(childAt);
            return childAt;
        }
        View childAt2 = viewGroup.getChildAt(i);
        O90.m5967e(childAt2, "getChildAt(...)");
        return childAt2;
    }

    /* renamed from: j */
    public static String m6013j(AbstractC7996Nd0 abstractC7996Nd0) {
        String strM24758c;
        O90.m5968f(abstractC7996Nd0, "type");
        if (abstractC7996Nd0 instanceof C7840Kd0) {
            return "[" + m6013j(((C7840Kd0) abstractC7996Nd0).f6237i);
        }
        if (abstractC7996Nd0 instanceof C7944Md0) {
            EnumC11057sd0 enumC11057sd0 = ((C7944Md0) abstractC7996Nd0).f7276i;
            return (enumC11057sd0 == null || (strM24758c = enumC11057sd0.m24758c()) == null) ? "V" : strM24758c;
        }
        if (abstractC7996Nd0 instanceof C7892Ld0) {
            return F91.m2539v(new StringBuilder("L"), ((C7892Ld0) abstractC7996Nd0).f6773i, ';');
        }
        throw new C6838sg();
    }

    @Override // p000.InterfaceC6319kk
    /* renamed from: a */
    public Class mo5742a() {
        return ByteBuffer.class;
    }

    @Override // p000.InterfaceC11257uB0
    /* renamed from: b */
    public boolean mo6014b(InterfaceC6976us interfaceC6976us, C1277UI c1277ui) {
        O90.m5968f(interfaceC6976us, "classDescriptor");
        return !c1277ui.getAnnotations().mo3261g(AbstractC11385vB0.f44237a);
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new ConcurrentHashMap();
    }

    @Override // p000.MR0
    /* renamed from: d */
    public JR0 mo5369d(ComponentCallbacks2C1874a componentCallbacks2C1874a, InterfaceC7486Di0 interfaceC7486Di0, OR0 or0, Context context) {
        return new GlideRequests(componentCallbacks2C1874a, interfaceC7486Di0, or0, context);
    }

    @Override // p000.InterfaceC6319kk
    /* renamed from: h */
    public Object mo5747h(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // p000.InterfaceC6411mC
    /* renamed from: k */
    public Iterable mo2553k(Object obj) {
        int i = AbstractC6940uI.f43634a;
        Collection collectionMo1222j = ((C8473Wh1) obj).mo1222j();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(collectionMo1222j));
        Iterator it = ((ArrayList) collectionMo1222j).iterator();
        while (it.hasNext()) {
            arrayList.add(((C8473Wh1) it.next()).mo2089x1());
        }
        return arrayList;
    }

    @Override // p000.InterfaceC8527Xi1
    /* renamed from: o */
    public void mo5749o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // p000.InterfaceC7229yt
    /* renamed from: q */
    public void mo2903q(C10976s01 c10976s01, Throwable th) {
        Object objM24574d = c10976s01.m24574d();
        AbstractC3929dS.m17682o(AbstractC7292zt.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c10976s01)), objM24574d == null ? null : objM24574d.getClass().getName());
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.f10059a;
        return null;
    }

    @Override // p000.InterfaceC8525Xh1
    /* renamed from: z */
    public Object mo407z(AbstractC11947zc0 abstractC11947zc0, float f) {
        return Float.valueOf(AbstractC7734Ic0.m3957d(abstractC11947zc0) * f);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f8361a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4346g.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11844L.m8754a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11896w.m8754a();
                l2.getClass();
                return l2;
            default:
                C9640hY1.f28446b.get();
                return Integer.valueOf((int) ((Long) C10664pY1.f40205d.m8754a()).longValue());
        }
    }

    public OJ1(Context context, C7754Im0 c7754Im0) {
        this.f8361a = 23;
        O90.m5968f(context, "context");
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new N00(2, this));
    }

    @Override // p000.InterfaceC7229yt
    /* renamed from: g */
    public void mo2898g() {
    }
}
