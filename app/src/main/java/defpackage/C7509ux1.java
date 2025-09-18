package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ux1 */
/* loaded from: classes.dex */
public final class C7509ux1 extends AbstractC6784r9 implements SignInConnectionListener {
    public final Semaphore k;
    public final Set l;

    public C7509ux1(SignInHubActivity signInHubActivity, Set set) {
        super(signInHubActivity);
        this.k = new Semaphore(0);
        this.l = set;
    }

    @Override // defpackage.AbstractC6784r9
    public final /* bridge */ /* synthetic */ Object g() throws InterruptedException {
        Iterator it = this.l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.k.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.k.release();
    }
}
