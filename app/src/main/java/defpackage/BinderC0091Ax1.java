package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.vk.push.core.base.AidlException;

/* renamed from: Ax1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0091Ax1 extends AbstractBinderC3854fs1 implements InterfaceC0559Gx1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC0325Dx1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0091Ax1(AbstractC0325Dx1 abstractC0325Dx1, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.b = i;
        this.g = abstractC0325Dx1;
    }

    @Override // defpackage.AbstractBinderC3854fs1
    public final boolean H(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
                AbstractC7700vx1.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) AbstractC7700vx1.a(parcel, Status.CREATOR);
                AbstractC7700vx1.b(parcel);
                t(status);
                break;
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
                Status status2 = (Status) AbstractC7700vx1.a(parcel, Status.CREATOR);
                AbstractC7700vx1.b(parcel);
                p(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.InterfaceC0559Gx1
    public void p(Status status) {
        switch (this.b) {
            case 1:
                ((C0247Cx1) this.g).setResult((C0247Cx1) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.InterfaceC0559Gx1
    public void t(Status status) {
        switch (this.b) {
            case 0:
                ((C0169Bx1) this.g).setResult((C0169Bx1) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
