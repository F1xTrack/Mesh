package p000;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ux1 */
/* loaded from: classes.dex */
public final class C11354ux1 extends AbstractC6725r9 implements SignInConnectionListener {

    /* renamed from: k */
    public final Semaphore f44050k;

    /* renamed from: l */
    public final Set f44051l;

    public C11354ux1(SignInHubActivity signInHubActivity, Set set) {
        super(signInHubActivity);
        this.f44050k = new Semaphore(0);
        this.f44051l = set;
    }

    @Override // p000.AbstractC6725r9
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo1583g() throws InterruptedException {
        Iterator it = this.f44051l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.f44050k.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f44050k.release();
    }
}
