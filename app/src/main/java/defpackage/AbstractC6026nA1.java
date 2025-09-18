package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: nA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6026nA1 {
    public static final VK a = new VK("KotlinTypeRefiner", 1);

    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC7209tN0.u(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
