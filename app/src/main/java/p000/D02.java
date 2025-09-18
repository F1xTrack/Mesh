package p000;

/* loaded from: classes.dex */
public final class D02 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D02)) {
            return false;
        }
        ((D02) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -228219804;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=common, enableFirelog=true, firelogEventType=1}";
    }
}
