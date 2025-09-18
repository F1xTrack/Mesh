package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.TaskUtil;

/* renamed from: wD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7752wD1 extends OA1 implements TR1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ S81 b;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BinderC7752wD1(S81 s81, OA1 oa1, int i) {
        this();
        this.a = i;
        this.b = s81;
        this.g = oa1;
    }

    @Override // defpackage.TR1
    public final void A(RJ1 rj1) {
        switch (this.a) {
            case 0:
                TaskUtil.setResultOrApiException(rj1.a, (Boolean) this.g, this.b);
                break;
            case 1:
                TaskUtil.setResultOrApiException(rj1.a, this.b);
                break;
            default:
                TaskUtil.setResultOrApiException(rj1.a, this.b);
                break;
        }
    }

    @Override // defpackage.OA1
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            RJ1 rj1 = (RJ1) LC1.a(parcel, RJ1.CREATOR);
            LC1.b(parcel);
            A(rj1);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }

    @Override // defpackage.TR1
    public final void zze() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((BinderC6038nE1) this.g).zze();
                break;
            default:
                ((BinderC2096aE1) this.g).zzf();
                break;
        }
    }

    public BinderC7752wD1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BinderC7752wD1(Boolean bool, S81 s81) {
        this();
        this.a = 0;
        this.g = bool;
        this.b = s81;
    }

    private final void G() {
    }
}
