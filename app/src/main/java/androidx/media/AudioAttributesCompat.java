package androidx.media;

import android.util.SparseIntArray;
import p000.InterfaceC7591Fi1;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC7591Fi1 {

    /* renamed from: b */
    public static final /* synthetic */ int f16326b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f16327a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f16327a;
        return audioAttributesImpl == null ? audioAttributesCompat.f16327a == null : audioAttributesImpl.equals(audioAttributesCompat.f16327a);
    }

    public final int hashCode() {
        return this.f16327a.hashCode();
    }

    public final String toString() {
        return this.f16327a.toString();
    }
}
