package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import ru.mes.dnevnik.R;

/* renamed from: rM0 */
/* loaded from: classes.dex */
public final class C6824rM0 extends A1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C6824rM0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.A1
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean zI;
        View childAt;
        ReadableMap readableMap;
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                if (!(view instanceof ViewGroupOnHierarchyChangeListenerC6634qM0) && !(view instanceof BK0)) {
                    ReactSoftExceptionLogger.logSoftException((String) this.e, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ".concat(view.getClass().getSimpleName())));
                    break;
                } else {
                    ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection);
                    if (readableMap2 != null) {
                        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
                        if (view instanceof ViewGroup) {
                            View childAt2 = ((ViewGroup) view).getChildAt(0);
                            if (childAt2 instanceof ViewGroup) {
                                Integer numValueOf = null;
                                int i = 0;
                                Integer numValueOf2 = null;
                                while (true) {
                                    ViewGroup viewGroup = (ViewGroup) childAt2;
                                    if (i >= viewGroup.getChildCount()) {
                                        break;
                                    } else {
                                        View childAt3 = viewGroup.getChildAt(i);
                                        if (!(view instanceof ViewGroupOnHierarchyChangeListenerC6634qM0)) {
                                            if (!(view instanceof BK0)) {
                                                break;
                                            } else {
                                                BK0 bk0 = (BK0) view;
                                                int iH = bk0.h(childAt3);
                                                Rect rect = bk0.K;
                                                childAt3.getDrawingRect(rect);
                                                zI = iH != 0 && Math.abs(iH) < rect.width();
                                            }
                                        } else {
                                            zI = ((ViewGroupOnHierarchyChangeListenerC6634qM0) view).i(childAt3);
                                        }
                                        ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(R.id.accessibility_collection_item);
                                        if (!(childAt3 instanceof ViewGroup)) {
                                            break;
                                        } else {
                                            ViewGroup viewGroup2 = (ViewGroup) childAt3;
                                            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(R.id.accessibility_collection_item)) != null) {
                                                readableMap3 = readableMap;
                                            }
                                            if (zI && readableMap3 != null) {
                                                if (numValueOf == null) {
                                                    numValueOf = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                                }
                                                numValueOf2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                                            }
                                            if (numValueOf != null && numValueOf2 != null) {
                                                accessibilityEvent.setFromIndex(numValueOf.intValue());
                                                accessibilityEvent.setToIndex(numValueOf2.intValue());
                                            }
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.A1
    public final void d(Q1 q1, View view) {
        int i;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!(view instanceof ViewGroupOnHierarchyChangeListenerC6634qM0) && !(view instanceof BK0)) {
                    ReactSoftExceptionLogger.logSoftException((String) obj, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: ".concat(view.getClass().getSimpleName())));
                    break;
                } else {
                    EnumC7769wJ0 enumC7769wJ0B = EnumC7769wJ0.b(view);
                    if (enumC7769wJ0B != null) {
                        C8149yJ0.A(q1, enumC7769wJ0B, view.getContext());
                    }
                    ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_collection);
                    if (readableMap != null) {
                        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
                    }
                    if (view instanceof ViewGroupOnHierarchyChangeListenerC6634qM0) {
                        q1.o(((ViewGroupOnHierarchyChangeListenerC6634qM0) view).getScrollEnabled());
                        break;
                    } else if (view instanceof BK0) {
                        q1.o(((BK0) view).getScrollEnabled());
                        break;
                    }
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = q1.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.d);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = q1.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                int i2 = MaterialButtonToggleGroup.k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).o));
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, q1.a);
                C2394bo0 c2394bo0 = (C2394bo0) obj;
                q1.m(c2394bo0.m.getVisibility() == 0 ? c2394bo0.getString(R.string.mtrl_picker_toggle_to_year_selection) : c2394bo0.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = q1.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).x);
                break;
        }
    }

    public C6824rM0() {
        this.d = 0;
        this.e = C6824rM0.class.getSimpleName();
    }
}
