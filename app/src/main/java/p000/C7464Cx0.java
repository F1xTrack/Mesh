package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: Cx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7464Cx0 extends AbstractC6550oP {

    /* renamed from: a */
    public final /* synthetic */ int f1782a;

    /* renamed from: b */
    public final boolean f1783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7464Cx0(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.f1782a = i3;
        this.f1783b = z;
    }

    @Override // p000.AbstractC6550oP
    public short getCoalescingKey() {
        switch (this.f1782a) {
            case 0:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // p000.AbstractC6550oP
    public final WritableMap getEventData() {
        switch (this.f1782a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("isCancelled", this.f1783b);
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putBoolean("value", this.f1783b);
                return writableMapCreateMap2;
        }
    }

    @Override // p000.AbstractC6550oP
    public final String getEventName() {
        switch (this.f1782a) {
            case 0:
                return "topAnimationFinish";
            default:
                return "topChange";
        }
    }
}
