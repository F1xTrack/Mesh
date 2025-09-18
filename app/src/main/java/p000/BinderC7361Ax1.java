package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.p019vk.push.core.base.AidlException;

/* renamed from: Ax1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7361Ax1 extends AbstractBinderC9424fs1 implements InterfaceC7673Gx1 {

    /* renamed from: b */
    public final /* synthetic */ int f490b;

    /* renamed from: g */
    public final /* synthetic */ AbstractC7517Dx1 f491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7361Ax1(AbstractC7517Dx1 abstractC7517Dx1, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f490b = i;
        this.f491g = abstractC7517Dx1;
    }

    @Override // p000.AbstractBinderC9424fs1
    /* renamed from: H */
    public final boolean mo416H(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
                AbstractC11482vx1.m25534b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) AbstractC11482vx1.m25533a(parcel, Status.CREATOR);
                AbstractC11482vx1.m25534b(parcel);
                mo418t(status);
                break;
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
                Status status2 = (Status) AbstractC11482vx1.m25533a(parcel, Status.CREATOR);
                AbstractC11482vx1.m25534b(parcel);
                mo417p(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.InterfaceC7673Gx1
    /* renamed from: p */
    public void mo417p(Status status) {
        switch (this.f490b) {
            case 1:
                ((C7465Cx1) this.f491g).setResult((C7465Cx1) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // p000.InterfaceC7673Gx1
    /* renamed from: t */
    public void mo418t(Status status) {
        switch (this.f490b) {
            case 0:
                ((C7413Bx1) this.f491g).setResult((C7413Bx1) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
