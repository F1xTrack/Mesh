package p000;

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
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.p019vk.push.common.HostInfoProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: Ev0 */
/* loaded from: classes.dex */
public class C7564Ev0 implements InterfaceC11848yq0, InterfaceC0750Lv, InterfaceC0062Az, InterfaceC1319Uy, InterfaceC8294Sw0, QN0, InterfaceC11253u90, PurchasesUpdatedListener, InterfaceC8939c61, InterfaceC6645pt, HostInfoProvider, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7564Ev0 f2959b;

    /* renamed from: c */
    public static final C7564Ev0 f2960c = new C7564Ev0(1);

    /* renamed from: d */
    public static final C7564Ev0 f2961d = new C7564Ev0(2);

    /* renamed from: e */
    public static final /* synthetic */ C7564Ev0 f2962e = new C7564Ev0(3);

    /* renamed from: f */
    public static final /* synthetic */ C7564Ev0 f2963f = new C7564Ev0(4);

    /* renamed from: g */
    public static final C1342VK f2964g = new C1342VK("PackageViewDescriptorFactory", 1);

    /* renamed from: h */
    public static final C7564Ev0 f2965h = new C7564Ev0(5);

    /* renamed from: i */
    public static final /* synthetic */ C7564Ev0 f2966i = new C7564Ev0(6);

    /* renamed from: a */
    public final /* synthetic */ int f2967a;

    public /* synthetic */ C7564Ev0(int i) {
        this.f2967a = i;
    }

    /* renamed from: e */
    public static byte[] m2447e(P70 p70, long j) {
        C4262il c4262il = new C4262il(20);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(p70.size());
        Iterator<E> it = p70.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c4262il.apply(it.next()));
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

    /* renamed from: i */
    public static synchronized C7564Ev0 m2448i() {
        try {
            if (f2959b == null) {
                f2959b = new C7564Ev0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2959b;
    }

    /* renamed from: j */
    public static int m2449j(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
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
                switch (i) {
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

    @Override // p000.InterfaceC8939c61
    /* renamed from: b */
    public boolean mo911b(C6686qX c6686qX) {
        return false;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new ConcurrentSkipListMap();
    }

    @Override // p000.InterfaceC6645pt
    /* renamed from: d */
    public long mo2451d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.InterfaceC8939c61
    /* renamed from: f */
    public InterfaceC9200e61 mo916f(C6686qX c6686qX) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC7637Gf1.class, Executor.class));
        O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return N02.m5507e((Executor) objMo4071h);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns-topics.rustore.ru";
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getScheme() {
        return "https";
    }

    @Override // p000.QN0
    public AbstractC7742Ig0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p000.InterfaceC8939c61
    /* renamed from: h */
    public int mo917h(C6686qX c6686qX) {
        return 1;
    }

    /* renamed from: k */
    public SparseIntArray[] mo2452k() {
        return null;
    }

    /* renamed from: l */
    public SparseIntArray[] mo2453l(Activity activity) {
        return null;
    }

    /* renamed from: m */
    public SparseIntArray[] mo2454m() {
        return null;
    }

    /* renamed from: n */
    public SparseIntArray[] mo2455n() {
        return null;
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        Api.ClientKey clientKey = RB1.f10059a;
        return null;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f2967a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4342c.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return (String) UW1.f11838F.m8754a();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11897x.m8754a();
                l.getClass();
                return l;
            default:
                C9640hY1.f28446b.get();
                Long l2 = (Long) C10664pY1.f40203b.m8754a();
                l2.getClass();
                return l2;
        }
    }

    public /* synthetic */ C7564Ev0(int i, Object obj) {
        this.f2967a = i;
    }

    /* renamed from: a */
    public void mo2450a(Activity activity) {
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
    }
}
