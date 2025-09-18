package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;

/* renamed from: iX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4364iX1 implements OptionalModuleApi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Feature[] b;

    public /* synthetic */ C4364iX1(Feature[] featureArr, int i) {
        this.a = i;
        this.b = featureArr;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        Feature[] featureArr = this.b;
        switch (this.a) {
            case 0:
                Feature[] featureArr2 = AbstractC0171By0.a;
                break;
            default:
                Feature[] featureArr3 = AbstractC0171By0.a;
                break;
        }
        return featureArr;
    }
}
