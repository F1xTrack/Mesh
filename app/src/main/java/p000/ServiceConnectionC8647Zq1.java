package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: Zq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC8647Zq1 implements ServiceConnection {

    /* renamed from: a */
    public final Context f15149a;

    /* renamed from: b */
    public final ReviewInfo f15150b;

    /* renamed from: c */
    public final String f15151c;

    /* renamed from: d */
    public final S51 f15152d;

    /* renamed from: e */
    public final C8501Wv1 f15153e;

    public ServiceConnectionC8647Zq1(Context context, ReviewInfo reviewInfo, String str, S51 s51, C8501Wv1 c8501Wv1) {
        O90.m5968f(reviewInfo, "reviewInfo");
        O90.m5968f(str, "applicationId");
        this.f15149a = context;
        this.f15150b = reviewInfo;
        this.f15151c = str;
        this.f15152d = s51;
        this.f15153e = c8501Wv1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC7879Kw1 c7671Gw1;
        try {
            int i = AbstractBinderC7723Hw1.f4610a;
            if (iBinder == null) {
                c7671Gw1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c7671Gw1 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7879Kw1)) ? new C7671Gw1(iBinder) : (InterfaceC7879Kw1) iInterfaceQueryLocalInterface;
            }
            ((C7671Gw1) c7671Gw1).m3199G(this.f15150b.toBundle$sdk_public_review_release(), this.f15151c, new BinderC10193lt0(this));
        } catch (Exception e) {
            C8501Wv1 c8501Wv1 = this.f15153e;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c8501Wv1.invoke(new TT0(message));
            try {
                this.f15149a.unbindService(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15153e.invoke(new TT0("onServiceDisconnected"));
        try {
            this.f15149a.unbindService(this);
        } catch (Throwable unused) {
        }
    }
}
