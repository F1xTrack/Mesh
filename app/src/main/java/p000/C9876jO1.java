package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedHashMap;

/* renamed from: jO1 */
/* loaded from: classes.dex */
public final class C9876jO1 extends C0640K9 {

    /* renamed from: g */
    public final /* synthetic */ NN1 f35111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9876jO1(NN1 nn1) {
        super(20);
        this.f35111g = nn1;
    }

    @Override // p000.C0640K9
    /* renamed from: d */
    public final Object mo4571d(Object obj) {
        LinkedHashMap linkedHashMap;
        C10124lK1 c10124lK1;
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        NN1 nn1 = this.f35111g;
        nn1.m18576z1();
        Preconditions.checkNotEmpty(str);
        boolean z = false;
        if (!TextUtils.isEmpty(str) && (c10124lK1 = (C10124lK1) nn1.f7740i.getOrDefault(str, null)) != null && c10124lK1.m22396m() != 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (!nn1.f7740i.containsKey(str) || nn1.f7740i.getOrDefault(str, null) == null) {
            nn1.m5665T1(str);
        } else {
            nn1.m5655J1(str, (C10124lK1) nn1.f7740i.getOrDefault(str, null));
        }
        C9876jO1 c9876jO1 = nn1.f7742k;
        synchronized (c9876jO1) {
            linkedHashMap = new LinkedHashMap((LinkedHashMap) c9876jO1.f5924f);
        }
        return (PA1) linkedHashMap.get(str);
    }
}
