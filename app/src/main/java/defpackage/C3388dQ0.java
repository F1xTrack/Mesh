package defpackage;

/* renamed from: dQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3388dQ0 extends RuntimeException {
    public C3388dQ0(Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
