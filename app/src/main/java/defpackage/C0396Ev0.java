package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.HostInfoProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: Ev0 */
/* loaded from: classes.dex */
public class C0396Ev0 implements InterfaceC8248yq0, InterfaceC0940Lv, InterfaceC0095Az, InterfaceC1651Uy, InterfaceC1490Sw0, QN0, InterfaceC7358u90, PurchasesUpdatedListener, InterfaceC2453c61, InterfaceC6541pt, HostInfoProvider, InterfaceC6053nJ1 {
    public static C0396Ev0 b;
    public static final C0396Ev0 c = new C0396Ev0(1);
    public static final C0396Ev0 d = new C0396Ev0(2);
    public static final /* synthetic */ C0396Ev0 e = new C0396Ev0(3);
    public static final /* synthetic */ C0396Ev0 f = new C0396Ev0(4);
    public static final VK g = new VK("PackageViewDescriptorFactory", 1);
    public static final C0396Ev0 h = new C0396Ev0(5);
    public static final /* synthetic */ C0396Ev0 i = new C0396Ev0(6);
    public final /* synthetic */ int a;

    public /* synthetic */ C0396Ev0(int i2) {
        this.a = i2;
    }

    public static byte[] e(P70 p70, long j) {
        C4403il c4403il = new C4403il(20);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(p70.size());
        Iterator<E> it = p70.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c4403il.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(UcumUtils.UCUM_DAYS, j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static synchronized C0396Ev0 i() {
        try {
            if (b == null) {
                b = new C0396Ev0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static int j(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return JosStatusCodes.RTN_CODE_COMMON_ERROR;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    @Override // defpackage.InterfaceC2453c61
    public boolean b(C6666qX c6666qX) {
        return false;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new ConcurrentSkipListMap();
    }

    @Override // defpackage.InterfaceC6541pt
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.InterfaceC2453c61
    public InterfaceC3519e61 f(C6666qX c6666qX) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Object objH = c1241Pr0.h(new C6997sG0(InterfaceC0505Gf1.class, Executor.class));
        O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.e((Executor) objH);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns-topics.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return "https";
    }

    @Override // defpackage.QN0
    public AbstractC0663Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC2453c61
    public int h(C6666qX c6666qX) {
        return 1;
    }

    public SparseIntArray[] k() {
        return null;
    }

    public SparseIntArray[] l(Activity activity) {
        return null;
    }

    public SparseIntArray[] m() {
        return null;
    }

    public SparseIntArray[] n() {
        return null;
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.a;
        return null;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.c.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return (String) UW1.F.a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l = (Long) UW1.x.a();
                l.getClass();
                return l;
            default:
                C4176hY1.b.get();
                Long l2 = (Long) C6480pY1.b.a();
                l2.getClass();
                return l2;
        }
    }

    public /* synthetic */ C0396Ev0(int i2, Object obj) {
        this.a = i2;
    }

    public void a(Activity activity) {
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
    }
}
