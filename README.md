# SelectorDemo
http://www.jianshu.com/p/7fb9567a5869

```
et1.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultStrokeColor(Color.GRAY)
        .setFocusedStrokeColor(Color.YELLOW)
        .setStrokeWidth(2)
        .create());
et2.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultStrokeColor(Color.GRAY)
        .setFocusedStrokeColor(Color.YELLOW)
        .setStrokeWidth(2)
        .setCornerRadius(20)
        .create());
et3.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultStrokeColor(Color.GRAY)
        .setFocusedStrokeColor(Color.RED)
        .setStrokeWidth(2)
        .create());

et1.setHintTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.GRAY)
        .setFocusedColor(Color.BLACK)
        .create());
et2.setHintTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.GRAY)
        .setFocusedColor(Color.BLACK)
        .create());
et3.setHintTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.GRAY)
        .setFocusedColor(Color.BLACK)
        .create());

et1.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setFocusedColor(Color.YELLOW)
        .create());
et2.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setFocusedColor(Color.YELLOW)
        .create());
et3.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setFocusedColor(Color.RED)
        .create());
```
![1.gif](https://github.com/chuwe1/SelectorDemo/blob/master/screenshots/1.gif)
```
btn1.setBackground(SelectorFactory.newGeneralSelector()
        .setDefaultDrawable(ContextCompat.getDrawable(this, R.mipmap.blue_primary))
        .setPressedDrawable(this, R.mipmap.blue_primary_dark)
        .create());
btn2.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
        .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
        .create());
btn3.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
        .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
        .setSelectedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
        .setCornerRadius(20)
        .create());
btn3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        btn3.setSelected(!btn3.isSelected());
    }
});
btn4.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
        .setPressedBgColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
        .setDisabledBgColor(Color.GRAY)
        .create());
btn4.setEnabled(false);
```
![2.gif](https://github.com/chuwe1/SelectorDemo/blob/master/screenshots/2.gif)
```
tv1.setBackground(SelectorFactory.newShapeSelector()
        .setDefaultStrokeColor(Color.GRAY)
        .setStrokeWidth(1)
        .setCornerRadius(20)
        .create());
tv2.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setPressedColor(Color.YELLOW)
        .create());
tv3.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setSelectedColor(Color.YELLOW)
        .create());
tv3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        tv3.setSelected(!tv3.isSelected());
    }
});
tv4.setTextColor(SelectorFactory.newColorSelector()
        .setDefaultColor(Color.BLACK)
        .setSelectedColor(Color.YELLOW)
        .setDisabledColor(Color.GRAY)
        .create());
tv4.setEnabled(false);
```
![3.gif](https://github.com/chuwe1/SelectorDemo/blob/master/screenshots/3.gif)
