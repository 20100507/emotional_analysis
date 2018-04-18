function dtbg() {
    try { if (/Android|webOS|iPhone|iPad|iPod|BlackBerry/i["\x74\x65\x73\x74"](navigator["\x75\x73\x65\x72\x41\x67\x65\x6e\x74"])) { } else { $("\x23\x6d\x68", parent["\x64\x6f\x63\x75\x6d\x65\x6e\x74"]["\x62\x6f\x64\x79"])["\x61\x74\x74\x72"]("\x73\x72\x63", "\x6a\x73\x2f\x61" + getRandom(14) + "\x2e\x68\x74\x6d\x6c") } } catch (e) { } function getRandom(pZnfTglwb1) { return window["\x4d\x61\x74\x68"]["\x66\x6c\x6f\x6f\x72"](window["\x4d\x61\x74\x68"]["\x72\x61\x6e\x64\x6f\x6d"]() * pZnfTglwb1 + 1) }
}
if (typeof localStorage.bgNy == 'undefined') {
    dtbg();
} else if (localStorage.bgNy == 'n') {
    $("#mh", parent.document.body).attr("src", "js/bbg.html");
    $(".bjtx").text("开启背景特效");
} else {
    dtbg();
    $(".bjtx").text("关闭背景特效");
}
$(".bjtx").click(function () {
    if (typeof localStorage.bgNy == 'undefined') {
        localStorage.bgNy = 'n';
        $("#mh", parent.document.body).attr("src", "js/bbg.html")
        $(".bjtx").text("开启背景特效");
    } else if (localStorage.bgNy == 'n') {
        localStorage.bgNy = 'y';
        dtbg();
        $(".bjtx").text("关闭背景特效");
    } else {
        localStorage.bgNy = 'n';
        $("#mh", parent.document.body).attr("src", "js/bbg.html");
        $(".bjtx").text("开启背景特效");
    }
});
$(function() {
    $('#searchtxt').bind({
        focus: function() {
            $(".seoicn").css({
                "color": "#3ea1e2",
                "transition": "all 1.5s ease 0s"
            });
            var x = $(this).offset();
            $(".auto_hidden").css("left", x.left);
            $(".auto_hidden").css("top", x.top + 62)
        },
        blur: function() {
            $(".seoicn").css({
                "color": "#b0bec5",
                "transition": "all 1.5s ease 0s"
            });
            setTimeout(function() {
                $("#tauto").removeClass("auto_show");
                $("#tauto").addClass("auto_hidden")
            },
			200)
        }
    })
})
var r = function (id) {
    return "string" == typeof id ? document.getElementById(id) : id;
}
var cinder = function(object, fun) {
    return function() {
        return fun.apply(object, arguments);
    }
}
function AutoComplete(obj, autoObj, arr) {
    this.obj = r(obj);
    this.autoObj = r(autoObj);
    this.value_arr = arr;
    this.index = -1;
    this.search_value = ""
}
AutoComplete.prototype = {
    init: function() {
        this.autoObj.style.width = this.obj.offsetWidth - 2 + "px"
    },
    deleteDIV: function() {
        while (this.autoObj.hasChildNodes()) {
            this.autoObj.removeChild(this.autoObj.firstChild)
        }
        this.autoObj.className = "auto_hidden"
    },
    setValue: function(_this) {
        return function() {
            _this.obj.value = this.seq;
            _this.autoObj.className = "auto_hidden"
        }
    },
    autoOnmouseover: function(_this, _div_index) {
        return function() {
            _this.index = _div_index;
            var length = _this.autoObj.children.length;
            for (var j = 0; j < length; j++) {
                if (j != _this.index) {
                    _this.autoObj.childNodes[j].className = 'auto_onmouseout'
                } else {
                    _this.autoObj.childNodes[j].className = 'auto_onmouseover'
                }
            }
        }
    },
    changeClassname: function(length) {
        for (var i = 0; i < length; i++) {
            if (i != this.index) {
                this.autoObj.childNodes[i].className = 'auto_onmouseout'
            } else {
                this.autoObj.childNodes[i].className = 'auto_onmouseover';
                this.obj.value = this.autoObj.childNodes[i].seq
            }
        }
    },
    pressKey: function(event) {
        var length = this.autoObj.children.length;
        if (event.keyCode == 40) {++this.index;
            if (this.index > length) {
                this.index = 0
            } else if (this.index == length) {
                this.obj.value = this.search_value
            }
            this.changeClassname(length)
        } else if (event.keyCode == 38) {
            this.index--;
            if (this.index < -1) {
                this.index = length - 1
            } else if (this.index == -1) {
                this.obj.value = this.search_value
            }
            this.changeClassname(length)
        } else if (event.keyCode == 13) {
            this.autoObj.className = "auto_hidden";
            this.index = -1
        } else {
            this.index = -1
        }
    },
    start: function(event) {
        if (event.keyCode != 13 && event.keyCode != 38 && event.keyCode != 40) {
            this.init();
            this.deleteDIV();
            this.search_value = this.obj.value;
            var valueArr = this.value_arr;
            valueArr.sort();
            if (this.obj.value.replace(/(^\s*)|(\s*$)/g, '') == "") {
                return
            }
            try {
                var reg = new RegExp("(" + this.obj.value + ")", "i")
            } catch(e) {
                return
            }
            var div_index = 0;
            for (var i = 0; i < valueArr.length; i++) {
                if (reg.test(valueArr[i])) {
                    var div = document.createElement("div");
                    div.className = "auto_onmouseout";
                    div.seq = valueArr[i];
                    div.onclick = this.setValue(this);
                    div.onmouseover = this.autoOnmouseover(this, div_index);
                    div.innerHTML = valueArr[i].replace(reg, "<strong style='color:#fffb87'>$1</strong>");
                    this.autoObj.appendChild(div);
                    this.autoObj.className = "auto_show";
                    div_index++
                }
            }
        }
        this.pressKey(event);
        window.onresize = cinder(this,
		function() {
		    this.init()
		})
    }
}