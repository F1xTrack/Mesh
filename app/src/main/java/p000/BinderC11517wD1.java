package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: wD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11517wD1 extends OA1 implements TR1 {

    /* renamed from: a */
    public final /* synthetic */ int f44715a;

    /* renamed from: b */
    public final /* synthetic */ S81 f44716b;

    /* renamed from: g */
    public final /* synthetic */ Object f44717g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC11517wD1(S81 s81, OA1 oa1, int i) {
        this();
        this.f44715a = i;
        this.f44716b = s81;
        this.f44717g = oa1;
    }

    @Override // p000.TR1
    /* renamed from: A */
    public final void mo7694A(RJ1 rj1) {
        switch (this.f44715a) {
            case 0:
                TaskUtil.setResultOrApiException(rj1.f10120a, (Boolean) this.f44717g, this.f44716b);
                break;
            case 1:
                TaskUtil.setResultOrApiException(rj1.f10120a, this.f44716b);
                break;
            default:
                TaskUtil.setResultOrApiException(rj1.f10120a, this.f44716b);
                break;
        }
    }

    @Override // p000.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            RJ1 rj1 = (RJ1) LC1.m4923a(parcel, RJ1.CREATOR);
            LC1.m4924b(parcel);
            mo7694A(rj1);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }

    @Override // p000.TR1
    public final void zze() {
        switch (this.f44715a) {
            case 0:
                break;
            case 1:
                ((BinderC10368nE1) this.f44717g).zze();
                break;
            default:
                ((BinderC8699aE1) this.f44717g).zzf();
                break;
        }
    }

    public BinderC11517wD1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC11517wD1(Boolean bool, S81 s81) {
        this();
        this.f44715a = 0;
        this.f44717g = bool;
        this.f44716b = s81;
    }

    /* renamed from: G */
    private final void m25576G() {
    }
}
