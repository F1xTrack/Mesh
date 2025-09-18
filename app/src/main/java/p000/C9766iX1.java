package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;

/* renamed from: iX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9766iX1 implements OptionalModuleApi {

    /* renamed from: a */
    public final /* synthetic */ int f29310a;

    /* renamed from: b */
    public final /* synthetic */ Feature[] f29311b;

    public /* synthetic */ C9766iX1(Feature[] featureArr, int i) {
        this.f29310a = i;
        this.f29311b = featureArr;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        Feature[] featureArr = this.f29311b;
        switch (this.f29310a) {
            case 0:
                Feature[] featureArr2 = AbstractC7414By0.f1103a;
                break;
            default:
                Feature[] featureArr3 = AbstractC7414By0.f1103a;
                break;
        }
        return featureArr;
    }
}
