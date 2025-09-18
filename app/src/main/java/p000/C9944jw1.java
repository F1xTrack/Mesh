package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: jw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9944jw1 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f35452e;

    /* renamed from: f */
    public final /* synthetic */ C8165Qj1 f35453f;

    /* renamed from: g */
    public final /* synthetic */ ReviewInfo f35454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9944jw1(C8165Qj1 c8165Qj1, ReviewInfo reviewInfo, int i) {
        super(1);
        this.f35452e = i;
        this.f35453f = c8165Qj1;
        this.f35454g = reviewInfo;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        Object objM7015b;
        Object objM7015b2;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        int i = 1;
        ReviewInfo reviewInfo = this.f35454g;
        C8165Qj1 c8165Qj1 = this.f35453f;
        switch (this.f35452e) {
            case 0:
                C9955k11 c9955k11 = (C9955k11) obj;
                O90.m5968f(c9955k11, "emitter");
                ReviewInfo reviewInfo2 = this.f35454g;
                try {
                    Context context = (Context) c8165Qj1.f9756a;
                    String str = (String) c8165Qj1.f9757b;
                    O90.m5967e(str, "applicationId");
                    C8165Qj1.m6748c((Context) c8165Qj1.f9756a, new C8501Wv1(c9955k11, 0), new ServiceConnectionC8647Zq1(context, reviewInfo2, str, new S51(15, c9955k11), new C8501Wv1(c9955k11, 1)));
                    objM7015b = c8313Tf1;
                } catch (Throwable th) {
                    objM7015b = RQ1.m7015b(th);
                }
                Throwable thM6365a = PS0.m6365a(objM7015b);
                if (thM6365a != null) {
                    c9955k11.m22133b(thM6365a);
                }
                return c8313Tf1;
            case 1:
                C9955k11 c9955k112 = (C9955k11) obj;
                O90.m5968f(c9955k112, "emitter");
                try {
                    Context context2 = (Context) c8165Qj1.f9756a;
                    Intent intent = new Intent("ru.vk.store.RequestAppReview");
                    intent.putExtra("KEY_APPLICATION_ID", (String) c8165Qj1.f9757b);
                    intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
                    C7655Go1 c7655Go1 = new C7655Go1(13, c9955k112);
                    int i2 = RuStoreActivityLauncher.f42135b;
                    ResultReceiverC0237Dl resultReceiverC0237Dl = new ResultReceiverC0237Dl(c7655Go1);
                    Intent intent2 = new Intent(context2, (Class<?>) RuStoreActivityLauncher.class);
                    if (!(context2 instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    intent2.putExtra("RESULT_RECEIVER", resultReceiverC0237Dl);
                    intent2.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context2, 0, intent, 1140850688));
                    context2.startActivity(intent2);
                    objM7015b2 = c8313Tf1;
                } catch (Throwable th2) {
                    objM7015b2 = RQ1.m7015b(th2);
                }
                Throwable thM6365a2 = PS0.m6365a(objM7015b2);
                if (thM6365a2 != null) {
                    c9955k112.m22133b(thM6365a2);
                }
                return c8313Tf1;
            default:
                O90.m5968f((C8313Tf1) obj, "it");
                c8165Qj1.getClass();
                return new C9059d11(new C9944jw1(c8165Qj1, reviewInfo, i));
        }
    }
}
