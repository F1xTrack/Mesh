package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: Zq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2019Zq1 implements ServiceConnection {
    public final Context a;
    public final ReviewInfo b;
    public final String c;
    public final S51 d;
    public final C1800Wv1 e;

    public ServiceConnectionC2019Zq1(Context context, ReviewInfo reviewInfo, String str, S51 s51, C1800Wv1 c1800Wv1) {
        O90.f(reviewInfo, "reviewInfo");
        O90.f(str, "applicationId");
        this.a = context;
        this.b = reviewInfo;
        this.c = str;
        this.d = s51;
        this.e = c1800Wv1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0868Kw1 c0556Gw1;
        try {
            int i = AbstractBinderC0634Hw1.a;
            if (iBinder == null) {
                c0556Gw1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c0556Gw1 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0868Kw1)) ? new C0556Gw1(iBinder) : (InterfaceC0868Kw1) iInterfaceQueryLocalInterface;
            }
            ((C0556Gw1) c0556Gw1).G(this.b.toBundle$sdk_public_review_release(), this.c, new BinderC5778lt0(this));
        } catch (Exception e) {
            C1800Wv1 c1800Wv1 = this.e;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c1800Wv1.invoke(new TT0(message));
            try {
                this.a.unbindService(this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.invoke(new TT0("onServiceDisconnected"));
        try {
            this.a.unbindService(this);
        } catch (Throwable unused) {
        }
    }
}
