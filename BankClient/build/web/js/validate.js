$(document).ready(function () {
    $('#contact_form').bootstrapValidator({
        fields: {
            accID: {
                validators: {
                    stringLength: {
                        min: 4,
                        message: 'Mã đối tác phải lớn hơn 3 kí tự'
                    },
                    notEmpty: {
                        message: 'Vui lòng nhập mã đối tác'
                    }
                }
            },
            password: {
                validators: {
                    stringLength: {
                        min: 4,
                        message: 'Mã phải lớn hơn 3 kí tự'
                    },
                    notEmpty: {
                        message: 'Vui lòng nhập mật khẩu đối tác'
                    }
                }
            },
            transName: {
                validators: {
                    stringLength: {
                        min: 4,
                        message: 'Mã khách hàng phải lớn hơn 3 kí tự'
                    },
                    notEmpty: {
                        message: 'Vui lòng nhập tên giao dịch'
                    }
                }
            },
            accIDReceive: {
                validators: {
                    stringLength: {
                        min: 4,
                        message: 'Mã phải lớn hơn 3 kí tự'
                    },
                    notEmpty: {
                        message: 'Vui lòng nhập mã khách hàng thanh toán'
                    }
                }
            },
            transMoney: {
                validators: {
                    integer: {
                        message: 'Chi được phép nhập giá trị số'
                    },
                    between: {
                        min: 20000,
                        max: 100000000,
                        message: 'Số tiền giao dịch được phép từ 20k đến 100tr'
                    },
                    notEmpty: {
                        message: 'Vui lòng nhập số tiền hàng thanh toán'
                    }
                }

            },
            transPostage: {
                validators: {
                    notEmpty: {
                        message: 'Vui lòng chọn cách tính phí thanh toán'
                    }
                }
            },
            beginDate: {
                validators: {
                    notEmpty: {
                        message: 'Vui lòng chọn ngày bắt đầu muốn truy vấn'
                    },
                    date: {
                        format: 'YYYY/MM/DD',
                        message: 'Định dạng Date sai'
                    }
                }
            },
             endDate: {
                validators: {
                    notEmpty: {
                        message: 'Vui lòng chọn ngày cuối muốn truy vấn'
                    },
                    date: {
                        format: 'YYYY/MM/DD',
                        message: 'Định dạng Date sai'
                    }
                }
            }
        }

    })
            .on('success.form.bv', function (e) {
                $('#success_message').slideDown({opacity: "show"}, "slow") // Do something ...
                $('#contact_form').data('bootstrapValidator').resetForm();

                // Prevent form submission
                e.preventDefault();

                // Get the form instance
                var $form = $(e.target);

                // Get the BootstrapValidator instance
                var bv = $form.data('bootstrapValidator');

                // Use Ajax to submit form data
                $.post($form.attr('action'), $form.serialize(), function (result) {
                    console.log(result);
                }, 'json');
            });
});