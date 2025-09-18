package p000;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.p015rn.push.constants.Core;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class BQ1 {
    /* renamed from: a */
    public static void m716a(InterfaceC0615Jl interfaceC0615Jl, Object[] objArr) {
        O90.m5968f(objArr, "args");
        if (EQ1.m2265b(interfaceC0615Jl) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(EQ1.m2265b(interfaceC0615Jl));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC1374Vq.m8591j(sb, objArr.length, " were provided."));
    }

    /* renamed from: b */
    public static final InputStream m717b(Context context, String str) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        Resources resources2 = context.getResources();
        String packageName = context.getPackageName();
        int identifier = resources2.getIdentifier(str, Core.RAW, packageName);
        Integer numValueOf = Integer.valueOf(identifier);
        Integer num = null;
        if (identifier == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            int identifier2 = resources2.getIdentifier(str, "drawable", packageName);
            Integer numValueOf2 = Integer.valueOf(identifier2);
            if (identifier2 != 0) {
                num = numValueOf2;
            }
        } else {
            num = numValueOf;
        }
        if (num == null) {
            throw new Resources.NotFoundException(str);
        }
        InputStream inputStreamOpenRawResource = resources.openRawResource(num.intValue());
        O90.m5967e(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
