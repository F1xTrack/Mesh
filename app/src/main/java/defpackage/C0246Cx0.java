package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: Cx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246Cx0 extends AbstractC6260oP {
    public final /* synthetic */ int a;
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0246Cx0(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.a = i3;
        this.b = z;
    }

    @Override // defpackage.AbstractC6260oP
    public short getCoalescingKey() {
        switch (this.a) {
            case 0:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("isCancelled", this.b);
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("target", getViewTag());
                writableMapCreateMap2.putBoolean("value", this.b);
                return writableMapCreateMap2;
        }
    }

    @Override // defpackage.AbstractC6260oP
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topAnimationFinish";
            default:
                return "topChange";
        }
    }
}
