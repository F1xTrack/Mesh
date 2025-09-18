package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.InterfaceC1787bT;
import p000.RN0;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, m22267d2 = {"Lexpo/modules/filesystem/MakeDirectoryOptions;", "LRN0;", "", "intermediates", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lexpo/modules/filesystem/MakeDirectoryOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIntermediates", "getIntermediates$annotations", "()V", "expo-file-system_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MakeDirectoryOptions implements RN0 {
    private final boolean intermediates;

    public MakeDirectoryOptions() {
        this(false, 1, null);
    }

    public static /* synthetic */ MakeDirectoryOptions copy$default(MakeDirectoryOptions makeDirectoryOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = makeDirectoryOptions.intermediates;
        }
        return makeDirectoryOptions.copy(z);
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getIntermediates$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIntermediates() {
        return this.intermediates;
    }

    public final MakeDirectoryOptions copy(boolean intermediates) {
        return new MakeDirectoryOptions(intermediates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MakeDirectoryOptions) && this.intermediates == ((MakeDirectoryOptions) other).intermediates;
    }

    public final boolean getIntermediates() {
        return this.intermediates;
    }

    public int hashCode() {
        return this.intermediates ? 1231 : 1237;
    }

    public String toString() {
        return "MakeDirectoryOptions(intermediates=" + this.intermediates + ")";
    }

    public MakeDirectoryOptions(boolean z) {
        this.intermediates = z;
    }

    public /* synthetic */ MakeDirectoryOptions(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
