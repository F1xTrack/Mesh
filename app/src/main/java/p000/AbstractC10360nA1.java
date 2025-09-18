package p000;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: nA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10360nA1 {

    /* renamed from: a */
    public static final C1342VK f38164a = new C1342VK("KotlinTypeRefiner", 1);

    /* renamed from: a */
    public static void m23095a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: b */
    public static void m23096b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC11153tN0.m24909u(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
