package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class BQ1 {
    public static void a(InterfaceC0755Jl interfaceC0755Jl, Object[] objArr) {
        O90.f(objArr, "args");
        if (EQ1.b(interfaceC0755Jl) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(EQ1.b(interfaceC0755Jl));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC1705Vq.j(sb, objArr.length, " were provided."));
    }

    public static final InputStream b(Context context, String str) throws Resources.NotFoundException {
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
        O90.e(inputStreamOpenRawResource, "openRawResource(...)");
        return inputStreamOpenRawResource;
    }
}
