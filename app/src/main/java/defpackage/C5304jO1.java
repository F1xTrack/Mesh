package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedHashMap;

/* renamed from: jO1 */
/* loaded from: classes.dex */
public final class C5304jO1 extends K9 {
    public final /* synthetic */ NN1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5304jO1(NN1 nn1) {
        super(20);
        this.g = nn1;
    }

    @Override // defpackage.K9
    public final Object d(Object obj) {
        LinkedHashMap linkedHashMap;
        C5674lK1 c5674lK1;
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        NN1 nn1 = this.g;
        nn1.z1();
        Preconditions.checkNotEmpty(str);
        boolean z = false;
        if (!TextUtils.isEmpty(str) && (c5674lK1 = (C5674lK1) nn1.i.getOrDefault(str, null)) != null && c5674lK1.m() != 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (!nn1.i.containsKey(str) || nn1.i.getOrDefault(str, null) == null) {
            nn1.T1(str);
        } else {
            nn1.J1(str, (C5674lK1) nn1.i.getOrDefault(str, null));
        }
        C5304jO1 c5304jO1 = nn1.k;
        synchronized (c5304jO1) {
            linkedHashMap = new LinkedHashMap((LinkedHashMap) c5304jO1.f);
        }
        return (PA1) linkedHashMap.get(str);
    }
}
